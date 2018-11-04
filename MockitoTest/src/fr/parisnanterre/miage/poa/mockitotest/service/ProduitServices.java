package fr.parisnanterre.miage.poa.mockitotest.service;

import fr.parisnanterre.miage.poa.mockitotest.api.IProduit;

public class ProduitServices {

    private IProduit produitAPI;

    public void setProduitAPI(IProduit produitAPI) {
        this.produitAPI = produitAPI;
    }

    public int prixTTC(int id){
        return produitAPI.getPrix(id) + produitAPI.getPrix(id) * produitAPI.getTauxTVA(id)/100;
    }
}
