// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package cn.edu.pku.poplar.domain;

import cn.edu.pku.poplar.domain.Pic;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect Pic_Roo_Finder {
    
    public static TypedQuery<Pic> Pic.findPicsByForwardPrimerLike(String forwardPrimer) {
        if (forwardPrimer == null || forwardPrimer.length() == 0) throw new IllegalArgumentException("The forwardPrimer argument is required");
        forwardPrimer = forwardPrimer.replace('*', '%');
        if (forwardPrimer.charAt(0) != '%') {
            forwardPrimer = "%" + forwardPrimer;
        }
        if (forwardPrimer.charAt(forwardPrimer.length() - 1) != '%') {
            forwardPrimer = forwardPrimer + "%";
        }
        EntityManager em = Pic.entityManager();
        TypedQuery<Pic> q = em.createQuery("SELECT o FROM Pic AS o WHERE LOWER(o.forwardPrimer) LIKE LOWER(:forwardPrimer)", Pic.class);
        q.setParameter("forwardPrimer", forwardPrimer);
        return q;
    }
    
    public static TypedQuery<Pic> Pic.findPicsByReferNameLike(String referName) {
        if (referName == null || referName.length() == 0) throw new IllegalArgumentException("The referName argument is required");
        referName = referName.replace('*', '%');
        if (referName.charAt(0) != '%') {
            referName = "%" + referName;
        }
        if (referName.charAt(referName.length() - 1) != '%') {
            referName = referName + "%";
        }
        EntityManager em = Pic.entityManager();
        TypedQuery<Pic> q = em.createQuery("SELECT o FROM Pic AS o WHERE LOWER(o.referName) LIKE LOWER(:referName)", Pic.class);
        q.setParameter("referName", referName);
        return q;
    }
    
    public static TypedQuery<Pic> Pic.findPicsByReversePrimerLike(String reversePrimer) {
        if (reversePrimer == null || reversePrimer.length() == 0) throw new IllegalArgumentException("The reversePrimer argument is required");
        reversePrimer = reversePrimer.replace('*', '%');
        if (reversePrimer.charAt(0) != '%') {
            reversePrimer = "%" + reversePrimer;
        }
        if (reversePrimer.charAt(reversePrimer.length() - 1) != '%') {
            reversePrimer = reversePrimer + "%";
        }
        EntityManager em = Pic.entityManager();
        TypedQuery<Pic> q = em.createQuery("SELECT o FROM Pic AS o WHERE LOWER(o.reversePrimer) LIKE LOWER(:reversePrimer)", Pic.class);
        q.setParameter("reversePrimer", reversePrimer);
        return q;
    }
    
}
