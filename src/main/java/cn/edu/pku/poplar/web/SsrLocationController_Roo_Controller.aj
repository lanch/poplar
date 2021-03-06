// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package cn.edu.pku.poplar.web;

<<<<<<< HEAD
import cn.edu.pku.poplar.domain.SsrLocation;
import cn.edu.pku.poplar.web.SsrLocationController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
=======
import cn.edu.pku.poplar.domain.Pic;
import cn.edu.pku.poplar.domain.SsrLocation;
import cn.edu.pku.poplar.domain.Transferbility;
>>>>>>> 7e13a5296e3f891cd6e1c3f6d7ed7596e61ab9fe
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

<<<<<<< HEAD
=======
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;

>>>>>>> 7e13a5296e3f891cd6e1c3f6d7ed7596e61ab9fe
privileged aspect SsrLocationController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String SsrLocationController.create(@Valid SsrLocation ssrLocation, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, ssrLocation);
            return "ssrlocations/create";
        }
        uiModel.asMap().clear();
        ssrLocation.persist();
        return "redirect:/ssrlocations/" + encodeUrlPathSegment(ssrLocation.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String SsrLocationController.createForm(Model uiModel) {
        populateEditForm(uiModel, new SsrLocation());
        return "ssrlocations/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String SsrLocationController.show(@PathVariable("id") Long id, Model uiModel) {
<<<<<<< HEAD
        uiModel.addAttribute("ssrlocation", SsrLocation.findSsrLocation(id));
=======
        SsrLocation ssrLocation = SsrLocation.findSsrLocation(id);
        uiModel.addAttribute("ssrlocation", ssrLocation);
        try{
            uiModel.addAttribute("pic", Pic.findPicsByReferNameLike(ssrLocation.getUniGeneId()).getSingleResult());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            Transferbility transferbility =  Transferbility.findTransferbilitysByReferNameEquals(ssrLocation.getUniGeneId()).getSingleResult();
            if(transferbility == null) {

            } else {
                uiModel.addAttribute("transferId", transferbility.getId());
            }
        } catch (Exception  e) {
            e.printStackTrace();
        }
>>>>>>> 7e13a5296e3f891cd6e1c3f6d7ed7596e61ab9fe
        uiModel.addAttribute("itemId", id);
        return "ssrlocations/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String SsrLocationController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("ssrlocations", SsrLocation.findSsrLocationEntries(firstResult, sizeNo));
            float nrOfPages = (float) SsrLocation.countSsrLocations() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("ssrlocations", SsrLocation.findAllSsrLocations());
        }
        return "ssrlocations/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String SsrLocationController.update(@Valid SsrLocation ssrLocation, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, ssrLocation);
            return "ssrlocations/update";
        }
        uiModel.asMap().clear();
        ssrLocation.merge();
        return "redirect:/ssrlocations/" + encodeUrlPathSegment(ssrLocation.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String SsrLocationController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, SsrLocation.findSsrLocation(id));
        return "ssrlocations/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String SsrLocationController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        SsrLocation ssrLocation = SsrLocation.findSsrLocation(id);
        ssrLocation.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/ssrlocations";
    }
    
    void SsrLocationController.populateEditForm(Model uiModel, SsrLocation ssrLocation) {
        uiModel.addAttribute("ssrLocation", ssrLocation);
    }
    
    String SsrLocationController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
