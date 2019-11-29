package com.mercadolibre;

import com.mercadolibre.api.DefaultApi;
import com.mercadolibre.model.ItemResponse;

import java.util.List;

public class MercadolibreScrapperApplication {

    private static final Long clientId = 5386902880310912L;
    private static final String clientSecret = "AjtMQNUlNDWGtBRLSHgOHQ86kvlbmvEb";
    private static final String redirectUri = "https://auth.mercadolibre.com.ar/authorization";
    private static final String accessToken = "APP_USR-5386902880310912-112914-2a6897c1e75c0eca59a88223175f8359-75724446";
    private static final DefaultApi api = new DefaultApi(new ApiClient(), clientId, clientSecret);

    public static void main(String[] args) throws ApiException {
        try {
            api.usersMeGet(accessToken);
        } catch (ApiException e) {
            if (e.getCode() == 401) {
                e.printStackTrace();
                return;
            } else {
                e.printStackTrace();
                return;
            }
        }

//        String categories = String.valueOf(api.defaultGet("/sites/MLA/categories"));
//        System.out.println(categories);
//        // category MLA5725: Accesorios para Vehículos

//        String subCategories = String.valueOf(api.defaultGet("/categories/MLA5725"));
//        System.out.println(subCategories);
//        // subcategory MLA1747: Repuestos Autos y Camionetas

//        String subSubCategories = String.valueOf(api.defaultGet("/categories/MLA1747"));
//        System.out.println(subSubCategories);
////        id=MLA85927, name=Electroventiladores, total_items_in_this_category=58006
////        id=MLA22260, name=Encendido, total_items_in_this_category=383319
////        id=MLA22292, name=Escapes, total_items_in_this_category=9317
////        id=MLA4859, name=Filtros, total_items_in_this_category=167326
////        id=MLA22291, name=Frenos, total_items_in_this_category=484969
////        id=MLA22245, name=Inyección, total_items_in_this_category=257967
////        id=MLA3172, name=Motor, total_items_in_this_category=948180
////        id=MLA22222, name=Suspensión y Dirección, total_items_in_this_category=985578
////        id=MLA373442, name=Transmisión, total_items_in_this_category=211565
////        id=MLA85960, name=Otros, total_items_in_this_category=30658

        List<ItemResponse> items = api.search(accessToken, "MLA", "MLA1747", "Honda");
        System.out.println(items);

        // TODO escribir los ítems en elasticsearch
        // TODO agrupar los mismos ítems que ofrece sarcro y analizar los valores de venta

    }
}
