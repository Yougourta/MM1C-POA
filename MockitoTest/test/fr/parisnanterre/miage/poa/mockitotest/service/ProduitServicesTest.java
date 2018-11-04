package fr.parisnanterre.miage.poa.mockitotest.service;

import fr.parisnanterre.miage.poa.mockitotest.api.IProduit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Spy;

import static org.mockito.BDDMockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class ProduitServicesTest {

    IProduit produitMock;
    ProduitServices produitServices;
    List list = new ArrayList();

    @BeforeEach
    void setUp() {
        produitMock = mock(IProduit.class);
        produitServices = new ProduitServices();

        //Controler le comportement des methodes de l'objet mocké
        when(produitMock.getPrix(1)).thenReturn(100);
        when(produitMock.getTauxTVA(1)).thenReturn(15);

        //Lever une exception
        when(produitMock.getTauxTVA(-1)).thenThrow(new IllegalArgumentException());

        produitServices.setProduitAPI(produitMock);


    }

    @AfterEach
    void tearDown() {
        produitMock = null;
        produitServices = null;
    }

    @Test
    void prixTTC() {

        //Tester si la méthode prixTTC fonctionne comme il se doit
        assertEquals(115, produitServices.prixTTC(1));

        //Verifier que la méthode getPrix est bien appelée deux fois
        verify(produitMock, times(2)).getPrix(1);

        /*--------------------------------------------------------------------*/

        //Espionner un objet list
        List spy = spy(list);

        //appeler les vraies méthodes de list
        spy.add("Un");
        spy.add("Deux");

        //tester le comportement du spy
        assertEquals("Deux", spy.get(1));

        /*--------------------------------------------------------------------*/

        /** Behaviour Driven Development - BDD **/
        //Given
        given(produitMock.getPrix(1)).willReturn(100);
        //when
        int result = produitMock.getPrix(1);
        //then
        assertEquals(result,100);
    }
}