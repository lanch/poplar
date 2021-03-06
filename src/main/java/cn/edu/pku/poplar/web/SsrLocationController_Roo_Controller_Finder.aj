// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package cn.edu.pku.poplar.web;

import cn.edu.pku.poplar.domain.SsrLocation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect SsrLocationController_Roo_Controller_Finder {
    
    @RequestMapping(params = { "find=ByUniGeneIdLike", "form" }, method = RequestMethod.GET)
    public String SsrLocationController.findSsrLocationsByUniGeneIdLikeForm(Model uiModel) {
        return "ssrlocations/findSsrLocationsByUniGeneIdLike";
    }
    
    @RequestMapping(params = "find=ByUniGeneIdLike", method = RequestMethod.GET)
    public String SsrLocationController.findSsrLocationsByUniGeneIdLike(@RequestParam("uniGeneId") String uniGeneId, Model uiModel) {
        uiModel.addAttribute("ssrlocations", SsrLocation.findSsrLocationsByUniGeneIdLike(uniGeneId).getResultList());
        return "ssrlocations/list";
    }

    @RequestMapping(params = {"find=ByBean", "form"}, method = RequestMethod.GET)
    public String SsrLocationController.findSSrLocationByBeanForm(Model uiModel) {
        uiModel.addAttribute("ssrLocation", new SsrLocation());
        return "ssrlocations/findSsrLocationsByBean";
    }

    @RequestMapping(params = "find=ByBean", method = RequestMethod.GET)
    public String SsrLocationController.findSsrLocationByBean(SsrLocation ssrLocation, Model uiModel) {
        uiModel.addAttribute("ssrlocations", SsrLocation.findSsrLocationsByBean(ssrLocation).getResultList());
        return "ssrlocations/list";
    }
}
