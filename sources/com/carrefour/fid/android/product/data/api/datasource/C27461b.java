package com.carrefour.fid.android.product.data.api.datasource;

import com.bumptech.glide.load.engine.GlideException;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAllergens;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAvailability;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTables;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTablesIncoNutrients;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTablesIncoVariante;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTablesNutrient;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffItemPicture;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffOfferFlags;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpProducts;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPictures;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductEnvelop;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductFlags;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductMetadata;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductsResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffStandardPricePerUnit;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffTraceability;
import com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.offer.C38064a;
import com.carrefour.fid.android.domain.models.offer.C38065b;
import com.carrefour.fid.android.domain.models.offer.CategoryLimit;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscount;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountPromotionCode;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.domain.models.offer.ProductEcoScore;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.carrefour.fid.android.domain.models.product.AllergenType;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.NutritionalItem;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.domain.models.product.ProductReference;
import com.carrefour.fid.android.domain.models.product.Traceability;
import com.carrefour.fid.android.domain.models.product.TraceabilityType;
import com.carrefour.fid.android.product.domain.model.C27585c;
import com.carrefour.fid.android.product.domain.model.C27593f;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.urbanairship.util.C9647e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nEntityProductToDomainProductMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityProductToDomainProductMapper.kt\ncom/carrefour/fid/android/product/data/api/datasource/EntityProductToDomainProductMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,322:1\n288#2,2:323\n1549#2:325\n1620#2,3:326\n1603#2,9:329\n1855#2:338\n1856#2:340\n1612#2:341\n1855#2,2:343\n1559#2:345\n1590#2,4:346\n1045#2:350\n1603#2,9:351\n1855#2:360\n288#2,2:361\n1856#2:364\n1612#2:365\n1#3:339\n1#3:342\n1#3:363\n*S KotlinDebug\n*F\n+ 1 EntityProductToDomainProductMapper.kt\ncom/carrefour/fid/android/product/data/api/datasource/EntityProductToDomainProductMapperKt\n*L\n44#1:323,2\n67#1:325\n67#1:326,3\n85#1:329,9\n85#1:338\n85#1:340\n85#1:341\n217#1:343,2\n305#1:345\n305#1:346,4\n309#1:350\n316#1:351,9\n316#1:360\n318#1:361,2\n316#1:364\n316#1:365\n85#1:339\n316#1:363\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.data.api.datasource.b */
public final class C27461b {

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 EntityProductToDomainProductMapper.kt\ncom/carrefour/fid/android/product/data/api/datasource/EntityProductToDomainProductMapperKt\n*L\n1#1,328:1\n309#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.product.data.api.datasource.b$a */
    public static final class C27462a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Integer.valueOf(((ProductPicture) t).getOrder()), Integer.valueOf(((ProductPicture) t2).getOrder()));
        }
    }

    /* renamed from: a */
    public static final List<C38064a> m115592a(BffProductsResponse bffProductsResponse, C28646a aVar) {
        Offer offer;
        C38064a aVar2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Double d;
        BffProductOffer bffProductOffer;
        List<BffProductEnvelop> data = bffProductsResponse.getData();
        if (data == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BffProductEnvelop bffProductEnvelop : data) {
            BffCommonProduct product = bffProductEnvelop.getProduct();
            List<BffProductOffer> offers = product.getOffers();
            if (offers == null || (bffProductOffer = (BffProductOffer) CollectionsKt___CollectionsKt.m40479B2(offers)) == null) {
                offer = null;
            } else {
                offer = m115598g(bffProductOffer, aVar, product);
            }
            BffCommonProduct product2 = bffProductEnvelop.getProduct();
            BffProductMetadata metadata = bffProductEnvelop.getMetadata();
            if (offer != null) {
                double h = C28782t.m119111h(product2.getScore());
                if (metadata != null) {
                    str = metadata.getProductCdbase();
                } else {
                    str = null;
                }
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (metadata != null) {
                    str3 = metadata.getStrategy();
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                if (metadata != null) {
                    str5 = metadata.getMainNodeId();
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                if (metadata != null) {
                    d = metadata.getScoreMainNodeId();
                } else {
                    d = null;
                }
                aVar2 = new C38064a(offer, h, str2, str4, str6, C28782t.m119111h(d));
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List<AllergenType> m115593b(BffAllergens bffAllergens) {
        ArrayList arrayList = new ArrayList();
        Boolean isContainingCelery = bffAllergens.isContainingCelery();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual((Object) isContainingCelery, (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_CELERY);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isContainingCrustaceans(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_CRUSTACEANS);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isContainingEgg(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_EGG);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isContainingFish(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_FISH);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isContainingGluten(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_GLUTEN);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isFreeFromLactose(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_LACTOSE);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isContainingLupine(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_LUPINE);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isContainingMolluscs(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_MOLLUSCS);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isContainingMustard(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_MUSTARD);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isContainingPeanuts(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_PEANUTS);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isContainingSesameSeeds(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_SESAME_SEEDS);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isContainingShellnuts(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_SHELLNUTS);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isContainingSoya(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_SOYA);
        }
        if (Intrinsics.areEqual((Object) bffAllergens.isContainingSulphurDioxide(), (Object) bool)) {
            arrayList.add(AllergenType.IS_CONTAINING_SULPHUR_DIOXIDE);
        }
        return CollectionsKt___CollectionsKt.m40557Q5(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.getIngredients();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.offer.ProductEcoScore m115594c(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood r1) {
        /*
            com.carrefour.fid.android.domain.models.offer.ProductEcoScore$a r0 = com.carrefour.fid.android.domain.models.offer.ProductEcoScore.f96144a
            if (r1 == 0) goto L_0x000f
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients r1 = r1.getIngredients()
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = r1.getEcoscore()
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            com.carrefour.fid.android.domain.models.offer.ProductEcoScore r1 = r0.mo118183a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.C27461b.m115594c(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood):com.carrefour.fid.android.domain.models.offer.ProductEcoScore");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.getIngredients();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.offer.ProductNutriScore m115595d(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood r1) {
        /*
            com.carrefour.fid.android.domain.models.offer.ProductNutriScore$a r0 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.f96151a
            if (r1 == 0) goto L_0x000f
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients r1 = r1.getIngredients()
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = r1.getNutriscore()
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            com.carrefour.fid.android.domain.models.offer.ProductNutriScore r1 = r0.mo118185a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.data.api.datasource.C27461b.m115595d(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood):com.carrefour.fid.android.domain.models.offer.ProductNutriScore");
    }

    /* renamed from: e */
    public static final List<NutritionalItem> m115596e(BffFood bffFood) {
        List<BffFoodNutritionalTablesNutrient> list;
        String str;
        String str2;
        BffFoodNutritionalTables nutritionalTables;
        List<BffFoodNutritionalTablesIncoVariante> incoVariante;
        BffFoodNutritionalTablesIncoVariante bffFoodNutritionalTablesIncoVariante;
        List<BffFoodNutritionalTablesIncoNutrients> incoNutrients;
        BffFoodNutritionalTablesIncoNutrients bffFoodNutritionalTablesIncoNutrients;
        if (bffFood == null || (nutritionalTables = bffFood.getNutritionalTables()) == null || (incoVariante = nutritionalTables.getIncoVariante()) == null || (bffFoodNutritionalTablesIncoVariante = (BffFoodNutritionalTablesIncoVariante) CollectionsKt___CollectionsKt.m40479B2(incoVariante)) == null || (incoNutrients = bffFoodNutritionalTablesIncoVariante.getIncoNutrients()) == null || (bffFoodNutritionalTablesIncoNutrients = (BffFoodNutritionalTablesIncoNutrients) CollectionsKt___CollectionsKt.m40479B2(incoNutrients)) == null) {
            list = null;
        } else {
            list = bffFoodNutritionalTablesIncoNutrients.getNutrient();
        }
        ArrayList arrayList = new ArrayList();
        String str3 = "";
        if (list != null) {
            str = str3;
            for (BffFoodNutritionalTablesNutrient bffFoodNutritionalTablesNutrient : list) {
                String unit = bffFoodNutritionalTablesNutrient.getUnit();
                if (unit != null) {
                    Locale locale = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
                    str2 = unit.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toLowerCase(locale)");
                } else {
                    str2 = null;
                }
                if (Intrinsics.areEqual((Object) str2, (Object) "kj")) {
                    str3 = bffFoodNutritionalTablesNutrient.getValue() + GlideException.C22148a.f56917d + bffFoodNutritionalTablesNutrient.getUnit();
                } else if (Intrinsics.areEqual((Object) str2, (Object) "kcal")) {
                    str = bffFoodNutritionalTablesNutrient.getValue() + GlideException.C22148a.f56917d + bffFoodNutritionalTablesNutrient.getUnit();
                } else {
                    String label = bffFoodNutritionalTablesNutrient.getLabel();
                    if (label == null) {
                        label = new String();
                    }
                    arrayList.add(new NutritionalItem(label, String.valueOf(bffFoodNutritionalTablesNutrient.getValue())));
                }
            }
        } else {
            str = str3;
        }
        List i = C10976s.m41417i();
        i.add(new NutritionalItem("Valeur énergétique", str3 + " / " + str));
        i.addAll(arrayList);
        return C10976s.m41409a(i);
    }

    /* renamed from: f */
    public static final Product m115597f(BffCommonProduct bffCommonProduct, C28646a aVar) {
        BffProductOffer bffProductOffer;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        List<OfferFlag> list;
        ProductCategory productCategory;
        ProductNutriScore productNutriScore;
        boolean z;
        ProductEcoScore productEcoScore;
        String str10;
        List<NutritionalItem> list2;
        String str11;
        List<AllergenType> list3;
        List<Traceability> list4;
        boolean z2;
        boolean z3;
        String str12;
        BffProductOffer bffProductOffer2;
        BffTraceability traceability;
        BffIngredients ingredients;
        BffAllergens allergens;
        BffIngredients ingredients2;
        BffIngredients ingredients3;
        Boolean isVerifiedAllergobox;
        List domain$default;
        BffProductOffer bffProductOffer3;
        BffPrices prices;
        BffStandardPricePerUnit standardPricePerUnit;
        BffProductOffer bffProductOffer4;
        BffPrices prices2;
        BffStandardPricePerUnit standardPricePerUnit2;
        Integer pricePerUnitValue;
        List<BffProductOffer> offers = bffCommonProduct.getOffers();
        List<Traceability> list5 = null;
        if (offers != null) {
            bffProductOffer = (BffProductOffer) CollectionsKt___CollectionsKt.m40479B2(offers);
        } else {
            bffProductOffer = null;
        }
        String gtin = bffCommonProduct.getGtin();
        if (gtin != null) {
            String b = Gtin.m157308b(gtin);
            String name = bffCommonProduct.getName();
            if (name == null) {
                str = "";
            } else {
                str = name;
            }
            List<ProductPicture> j = m115601j(bffCommonProduct.getPictures());
            String packaging = bffCommonProduct.getPackaging();
            if (packaging == null) {
                str2 = "";
            } else {
                str2 = packaging;
            }
            List<BffProductOffer> offers2 = bffCommonProduct.getOffers();
            if (offers2 == null || (bffProductOffer4 = (BffProductOffer) CollectionsKt___CollectionsKt.m40479B2(offers2)) == null || (prices2 = bffProductOffer4.getPrices()) == null || (standardPricePerUnit2 = prices2.getStandardPricePerUnit()) == null || (pricePerUnitValue = standardPricePerUnit2.getPricePerUnitValue()) == null) {
                str3 = null;
            } else {
                str3 = pricePerUnitValue.toString();
            }
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            List<BffProductOffer> offers3 = bffCommonProduct.getOffers();
            if (offers3 == null || (bffProductOffer3 = (BffProductOffer) CollectionsKt___CollectionsKt.m40479B2(offers3)) == null || (prices = bffProductOffer3.getPrices()) == null || (standardPricePerUnit = prices.getStandardPricePerUnit()) == null) {
                str5 = null;
            } else {
                str5 = standardPricePerUnit.getUnitOfMeasure();
            }
            if (str5 == null) {
                str6 = "";
            } else {
                str6 = str5;
            }
            String informationFlagFormat = bffCommonProduct.getInformationFlagFormat();
            if (informationFlagFormat == null) {
                str7 = "";
            } else {
                str7 = informationFlagFormat;
            }
            if (bffProductOffer != null) {
                str8 = bffProductOffer.getOrigin();
            } else {
                str8 = null;
            }
            if (str8 == null) {
                str9 = "";
            } else {
                str9 = str8;
            }
            BffProductFlags flags = bffCommonProduct.getFlags();
            if (flags != null) {
                list = C27465e.m115611a(flags);
            } else {
                list = null;
            }
            if (list == null) {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            List<OfferFlag> list6 = list;
            List<BffCommonCategory> categories = bffCommonProduct.getCategories();
            if (categories == null || (domain$default = BffSharedMapperKt.toDomain$default((List) categories, aVar, (Map) null, 2, (Object) null)) == null) {
                productCategory = null;
            } else {
                productCategory = (ProductCategory) CollectionsKt___CollectionsKt.m40479B2(domain$default);
            }
            BffFood food = bffCommonProduct.getFood();
            if (food != null) {
                productNutriScore = m115595d(food);
            } else {
                productNutriScore = null;
            }
            String cdbase = bffCommonProduct.getCdbase();
            if (cdbase == null) {
                cdbase = "";
            }
            String b2 = ProductReference.m157466b(cdbase);
            String warningAdvices = bffCommonProduct.getWarningAdvices();
            String consumerAdvice = bffCommonProduct.getConsumerAdvice();
            String serviceCenterContact = bffCommonProduct.getServiceCenterContact();
            String storageMode = bffCommonProduct.getStorageMode();
            String informationFlagFormat2 = bffCommonProduct.getInformationFlagFormat();
            String fullDescription = bffCommonProduct.getFullDescription();
            BffProductFlags flags2 = bffCommonProduct.getFlags();
            if (flags2 == null || (isVerifiedAllergobox = flags2.isVerifiedAllergobox()) == null) {
                z = false;
            } else {
                z = isVerifiedAllergobox.booleanValue();
            }
            BffFood food2 = bffCommonProduct.getFood();
            if (food2 != null) {
                productEcoScore = m115594c(food2);
            } else {
                productEcoScore = null;
            }
            BffFood food3 = bffCommonProduct.getFood();
            if (food3 == null || (ingredients3 = food3.getIngredients()) == null) {
                str10 = null;
            } else {
                str10 = ingredients3.getIngredientStatement();
            }
            BffFood food4 = bffCommonProduct.getFood();
            if (food4 == null || (list2 = m115596e(food4)) == null) {
                list2 = CollectionsKt__CollectionsKt.m40441E();
            }
            List<NutritionalItem> list7 = list2;
            BffFood food5 = bffCommonProduct.getFood();
            if (food5 == null || (ingredients2 = food5.getIngredients()) == null) {
                str11 = null;
            } else {
                str11 = ingredients2.getAlcoholByVolumeLabel();
            }
            BffFood food6 = bffCommonProduct.getFood();
            if (food6 == null || (ingredients = food6.getIngredients()) == null || (allergens = ingredients.getAllergens()) == null) {
                list3 = null;
            } else {
                list3 = m115593b(allergens);
            }
            if (list3 == null) {
                list3 = CollectionsKt__CollectionsKt.m40441E();
            }
            List<AllergenType> list8 = list3;
            List<BffProductOffer> offers4 = bffCommonProduct.getOffers();
            if (!(offers4 == null || (bffProductOffer2 = (BffProductOffer) CollectionsKt___CollectionsKt.m40479B2(offers4)) == null || (traceability = bffProductOffer2.getTraceability()) == null)) {
                list5 = m115606o(traceability);
            }
            if (list5 == null) {
                list4 = CollectionsKt__CollectionsKt.m40441E();
            } else {
                list4 = list5;
            }
            Boolean bffIsFood = bffCommonProduct.getBffIsFood();
            if (bffIsFood != null) {
                z2 = bffIsFood.booleanValue();
            } else {
                z2 = true;
            }
            boolean z4 = !z2;
            Boolean containAlcohol = bffCommonProduct.getContainAlcohol();
            if (containAlcohol != null) {
                z3 = containAlcohol.booleanValue();
            } else {
                z3 = false;
            }
            String bffDisplayBrand = bffCommonProduct.getBffDisplayBrand();
            if (bffDisplayBrand == null) {
                str12 = "";
            } else {
                str12 = bffDisplayBrand;
            }
            return new Product(b, productCategory, list6, j, productNutriScore, str9, str2, b2, str, str4, str6, str7, storageMode, warningAdvices, consumerAdvice, serviceCenterContact, informationFlagFormat2, fullDescription, z, productEcoScore, str10, list7, str11, list8, list4, z4, str12, z3, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException("Product without gtin field!");
    }

    @C12579k
    /* renamed from: g */
    public static final Offer m115598g(@C12579k BffProductOffer bffProductOffer, @C12579k C28646a aVar, @C12579k BffCommonProduct bffCommonProduct) {
        int i;
        int i2;
        int i3;
        Prices h;
        Discount discount;
        boolean z;
        String str;
        OfferAvailability offerAvailability;
        List<Discount> domain;
        C28646a aVar2 = aVar;
        BffCommonProduct bffCommonProduct2 = bffCommonProduct;
        Intrinsics.checkNotNullParameter(bffProductOffer, "<this>");
        Intrinsics.checkNotNullParameter(aVar2, "errorReporter");
        Intrinsics.checkNotNullParameter(bffCommonProduct2, "bffProduct");
        String gtin = bffProductOffer.getGtin();
        if (gtin != null) {
            String b = Gtin.m157308b(gtin);
            String cdbase = bffProductOffer.getCdbase();
            if (cdbase != null) {
                Boolean bool = null;
                OfferIdentifier offerIdentifier = new OfferIdentifier(b, ProductReference.m157466b(cdbase), (DefaultConstructorMarker) null);
                Integer purchasingStep = bffProductOffer.getPurchasingStep();
                if (purchasingStep != null) {
                    i = purchasingStep.intValue();
                } else {
                    i = 1;
                }
                int i4 = i;
                Integer purchasingMax = bffProductOffer.getPurchasingMax();
                if (purchasingMax != null) {
                    i2 = purchasingMax.intValue();
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                int i5 = i2;
                Integer purchasingMin = bffProductOffer.getPurchasingMin();
                if (purchasingMin != null) {
                    i3 = purchasingMin.intValue();
                } else {
                    i3 = 0;
                }
                List E = CollectionsKt__CollectionsKt.m40441E();
                BffPrices prices = bffProductOffer.getPrices();
                if (prices == null || (h = m115599h(prices)) == null) {
                    throw new IllegalStateException("Offer without price field!");
                }
                List<BffBffDiscount> bffDiscounts = bffProductOffer.getBffDiscounts();
                if (bffDiscounts == null || (domain = BffSharedMapperKt.toDomain(bffDiscounts, aVar2, ProductToDomainMapperKt.m115575b(bffProductOffer))) == null) {
                    discount = null;
                } else {
                    discount = (Discount) CollectionsKt___CollectionsKt.m40479B2(domain);
                }
                String freshnessGaranteed = bffProductOffer.getFreshnessGaranteed();
                Product f = m115597f(bffCommonProduct2, aVar2);
                Boolean isVariableWeight = bffProductOffer.isVariableWeight();
                if (isVariableWeight != null) {
                    z = isVariableWeight.booleanValue();
                } else {
                    z = false;
                }
                String bffVariableWeightSafetyMargin = bffProductOffer.getBffVariableWeightSafetyMargin();
                if (bffVariableWeightSafetyMargin != null) {
                    if (C11622t.isBlank(bffVariableWeightSafetyMargin)) {
                        bffVariableWeightSafetyMargin = C38065b.f96182f;
                    }
                    str = bffVariableWeightSafetyMargin;
                } else {
                    str = C38065b.f96182f;
                }
                BffAvailability availability = bffProductOffer.getAvailability();
                if (availability != null) {
                    bool = availability.getBffIsAvailable();
                }
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.areEqual((Object) bool, (Object) bool2)) {
                    offerAvailability = OfferAvailability.AVAILABLE;
                } else {
                    offerAvailability = OfferAvailability.UNAVAILABLE;
                }
                OfferAvailability offerAvailability2 = offerAvailability;
                boolean areEqual = Intrinsics.areEqual((Object) bffProductOffer.getBffIsPurchasable(), (Object) bool2);
                boolean areEqual2 = Intrinsics.areEqual((Object) bffProductOffer.getBffIsIncontournable(), (Object) bool2);
                String labelHighlight = bffProductOffer.getLabelHighlight();
                if (labelHighlight == null) {
                    labelHighlight = "";
                }
                return new Offer(offerIdentifier, (CategoryLimit) null, (OfferDiscount) null, (OfferDiscountPromotionCode) null, i4, i5, i3, E, h, discount, (Double) null, (Double) null, f, 0, false, false, false, z, str, offerAvailability2, areEqual, areEqual2, freshnessGaranteed, false, labelHighlight, false, m115600i(bffProductOffer.getFlags()), C9647e0.f26435a, (DefaultConstructorMarker) null);
            }
            throw new IllegalStateException("Offer without cdbase field!");
        }
        throw new IllegalStateException("Offer without gtin field!");
    }

    @C12579k
    /* renamed from: h */
    public static final Prices m115599h(@C12580l BffPrices bffPrices) {
        double d;
        double d2;
        double d3;
        String str;
        BffStandardPricePerUnit standardPricePerUnit;
        BffStandardPricePerUnit standardPricePerUnit2;
        Integer pricePerUnitValue;
        BffStandardPricePerUnit standardPricePerUnit3;
        Integer pricePerUnitValue2;
        Integer salePrice;
        Integer startingPrice;
        double d4 = 0.0d;
        if (bffPrices == null || (startingPrice = bffPrices.getStartingPrice()) == null) {
            d = 0.0d;
        } else {
            d = m115603l(startingPrice);
        }
        if (bffPrices == null || (salePrice = bffPrices.getSalePrice()) == null) {
            d2 = 0.0d;
        } else {
            d2 = m115603l(salePrice);
        }
        if (bffPrices == null || (standardPricePerUnit3 = bffPrices.getStandardPricePerUnit()) == null || (pricePerUnitValue2 = standardPricePerUnit3.getPricePerUnitValue()) == null) {
            d3 = 0.0d;
        } else {
            d3 = m115603l(pricePerUnitValue2);
        }
        if (!(bffPrices == null || (standardPricePerUnit2 = bffPrices.getStandardPricePerUnit()) == null || (pricePerUnitValue = standardPricePerUnit2.getPricePerUnitValue()) == null)) {
            d4 = m115603l(pricePerUnitValue);
        }
        String b = C28782t.m119105b(Double.valueOf(d4));
        if (bffPrices == null || (standardPricePerUnit = bffPrices.getStandardPricePerUnit()) == null) {
            str = null;
        } else {
            str = standardPricePerUnit.getUnitOfMeasure();
        }
        if (str == null) {
            str = "";
        }
        return new Prices(d, d2, d3, b + "/" + str, 0.0d, 0.0d);
    }

    /* renamed from: i */
    public static final List<Offer.Flags> m115600i(BffOfferFlags bffOfferFlags) {
        if (bffOfferFlags == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.areEqual((Object) bffOfferFlags.isClubFamille(), (Object) Boolean.TRUE)) {
            arrayList.add(Offer.Flags.CLUB_FAMILLE);
        }
        return arrayList;
    }

    /* renamed from: j */
    public static final List<ProductPicture> m115601j(BffPictures bffPictures) {
        List<BffItemPicture> medium;
        if (!(bffPictures == null || (medium = bffPictures.getMedium()) == null)) {
            Iterable iterable = medium;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            int i = 0;
            for (Object next : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                BffItemPicture bffItemPicture = (BffItemPicture) next;
                String path = bffItemPicture.getPath();
                if (path == null) {
                    path = "";
                }
                Integer order = bffItemPicture.getOrder();
                if (order != null) {
                    i = order.intValue();
                }
                arrayList.add(new ProductPicture(path, i));
                i = i2;
            }
            List<ProductPicture> p5 = CollectionsKt___CollectionsKt.m40675p5(arrayList, new C27462a());
            if (p5 != null) {
                return p5;
            }
        }
        return CollectionsKt__CollectionsKt.m40441E();
    }

    @C12579k
    /* renamed from: k */
    public static final List<Offer> m115602k(@C12579k List<BffCommonProduct> list, @C12579k C28646a aVar, @C12579k String str) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "$this$toDomain");
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        ArrayList arrayList = new ArrayList();
        for (BffCommonProduct bffCommonProduct : list) {
            List<BffProductOffer> offers = bffCommonProduct.getOffers();
            Offer offer = null;
            if (offers != null) {
                Iterator it = offers.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual((Object) ((BffProductOffer) obj).getFacilityServiceId(), (Object) str)) {
                        break;
                    }
                }
                BffProductOffer bffProductOffer = (BffProductOffer) obj;
                if (bffProductOffer != null) {
                    offer = m115598g(bffProductOffer, aVar, bffCommonProduct);
                }
            }
            if (offer != null) {
                arrayList.add(offer);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public static final double m115603l(Integer num) {
        if (num != null) {
            return ((double) num.intValue()) / ((double) 100);
        }
        return 0.0d;
    }

    @C12579k
    /* renamed from: m */
    public static final Object m115604m(@C12580l BffProductsResponse bffProductsResponse, @C12579k C28646a aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        if (bffProductsResponse != null) {
            List<C38064a> a = m115592a(bffProductsResponse, aVar);
            Collection collection = a;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Result.C10852a aVar2 = Result.f28060a;
                return Result.m38702b(CollectionsKt__CollectionsKt.m40441E());
            }
            Result.C10852a aVar3 = Result.f28060a;
            Iterable<C38064a> iterable = a;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (C38064a aVar4 : iterable) {
                arrayList.add(new C27593f(aVar4.mo118196j(), aVar4.mo118198l(), aVar4.mo118197k(), aVar4.mo118200n(), aVar4.mo118195i(), aVar4.mo118199m()));
            }
            return Result.m38702b(arrayList);
        }
        Result.C10852a aVar5 = Result.f28060a;
        return Result.m38702b(CollectionsKt__CollectionsKt.m40441E());
    }

    @C12579k
    /* renamed from: n */
    public static final Object m115605n(@C12580l BffPdpResponse bffPdpResponse, @C12579k C28646a aVar, @C12579k String str) {
        BffCommonProduct product;
        List<Offer> list;
        Object obj;
        Offer g;
        List<BffCommonProduct> mixedProducts;
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        if (bffPdpResponse != null) {
            BffPdpProducts data = bffPdpResponse.getData();
            if (data == null || (product = data.getProduct()) == null) {
                Result.C10852a aVar2 = Result.f28060a;
                return Result.m38702b(C11661u0.m45734a(new Throwable("Can't find product")));
            }
            List<BffProductOffer> offers = product.getOffers();
            if (offers != null) {
                Iterator it = offers.iterator();
                while (true) {
                    list = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual((Object) ((BffProductOffer) obj).getFacilityServiceId(), (Object) str)) {
                        break;
                    }
                }
                BffProductOffer bffProductOffer = (BffProductOffer) obj;
                if (!(bffProductOffer == null || (g = m115598g(bffProductOffer, aVar, product)) == null)) {
                    BffPdpProducts data2 = bffPdpResponse.getData();
                    if (!(data2 == null || (mixedProducts = data2.getMixedProducts()) == null)) {
                        list = m115602k(mixedProducts, aVar, str);
                    }
                    if (list == null) {
                        list = CollectionsKt__CollectionsKt.m40441E();
                    }
                    Result.C10852a aVar3 = Result.f28060a;
                    return Result.m38702b(new C27585c(g, list));
                }
            }
            Result.C10852a aVar4 = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(new Throwable("Can't find offer in product")));
        }
        Result.C10852a aVar5 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(new Throwable("Can't parse product from BffPdpResponse")));
    }

    @C12579k
    /* renamed from: o */
    public static final List<Traceability> m115606o(@C12579k BffTraceability bffTraceability) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Intrinsics.checkNotNullParameter(bffTraceability, "<this>");
        ArrayList arrayList = new ArrayList();
        String breedingArea = bffTraceability.getBreedingArea();
        boolean z17 = false;
        if (breedingArea == null || C11622t.isBlank(breedingArea)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList.add(new Traceability(TraceabilityType.BREEDING_AREA, bffTraceability.getBreedingArea()));
        }
        String fishingArea = bffTraceability.getFishingArea();
        if (fishingArea == null || C11622t.isBlank(fishingArea)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            arrayList.add(new Traceability(TraceabilityType.FISHING_AREA, bffTraceability.getFishingArea()));
        }
        String underFishingArea = bffTraceability.getUnderFishingArea();
        if (underFishingArea == null || C11622t.isBlank(underFishingArea)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            arrayList.add(new Traceability(TraceabilityType.UNDER_FISHING_AREA, bffTraceability.getUnderFishingArea()));
        }
        String latinFishName = bffTraceability.getLatinFishName();
        if (latinFishName == null || C11622t.isBlank(latinFishName)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            arrayList.add(new Traceability(TraceabilityType.LATIN_FISHNAME, bffTraceability.getLatinFishName()));
        }
        String bornIn = bffTraceability.getBornIn();
        if (bornIn == null || C11622t.isBlank(bornIn)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            arrayList.add(new Traceability(TraceabilityType.BORN_IN, bffTraceability.getBornIn()));
        }
        String raisedIn = bffTraceability.getRaisedIn();
        if (raisedIn == null || C11622t.isBlank(raisedIn)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            arrayList.add(new Traceability(TraceabilityType.RAISED_IN, bffTraceability.getRaisedIn()));
        }
        String shotIn = bffTraceability.getShotIn();
        if (shotIn == null || C11622t.isBlank(shotIn)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            arrayList.add(new Traceability(TraceabilityType.SHOT_IN, bffTraceability.getShotIn()));
        }
        String ageAtSlaughter = bffTraceability.getAgeAtSlaughter();
        if (ageAtSlaughter == null || C11622t.isBlank(ageAtSlaughter)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            arrayList.add(new Traceability(TraceabilityType.AGE_AT_SLAUGHTER, bffTraceability.getAgeAtSlaughter()));
        }
        String turnedInto = bffTraceability.getTurnedInto();
        if (turnedInto == null || C11622t.isBlank(turnedInto)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            arrayList.add(new Traceability(TraceabilityType.TURNED_INTO, bffTraceability.getTurnedInto()));
        }
        String saltAddition = bffTraceability.getSaltAddition();
        if (saltAddition == null || C11622t.isBlank(saltAddition)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            arrayList.add(new Traceability(TraceabilityType.SALT_ADDITION, bffTraceability.getSaltAddition()));
        }
        String captureGear = bffTraceability.getCaptureGear();
        if (captureGear == null || C11622t.isBlank(captureGear)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            arrayList.add(new Traceability(TraceabilityType.CAPTURE_GEAR, bffTraceability.getCaptureGear()));
        }
        String productionMethod = bffTraceability.getProductionMethod();
        if (productionMethod == null || C11622t.isBlank(productionMethod)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            arrayList.add(new Traceability(TraceabilityType.PRODUCTION_METHOD, bffTraceability.getProductionMethod()));
        }
        String thawedProducts = bffTraceability.getThawedProducts();
        if (thawedProducts == null || C11622t.isBlank(thawedProducts)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            arrayList.add(new Traceability(TraceabilityType.THAWED_PRODUCTS, bffTraceability.getThawedProducts()));
        }
        String brineProducts = bffTraceability.getBrineProducts();
        if (brineProducts == null || C11622t.isBlank(brineProducts)) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14) {
            arrayList.add(new Traceability(TraceabilityType.BRINE_PRODUCTS, bffTraceability.getBrineProducts()));
        }
        String caliber = bffTraceability.getCaliber();
        if (caliber == null || C11622t.isBlank(caliber)) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!z15) {
            arrayList.add(new Traceability(TraceabilityType.CALIBER, bffTraceability.getCaliber()));
        }
        String variety = bffTraceability.getVariety();
        if (variety == null || C11622t.isBlank(variety)) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (!z16) {
            arrayList.add(new Traceability(TraceabilityType.VARIETY, bffTraceability.getVariety()));
        }
        String category = bffTraceability.getCategory();
        if (category == null || C11622t.isBlank(category)) {
            z17 = true;
        }
        if (!z17) {
            arrayList.add(new Traceability(TraceabilityType.CATEGORY, bffTraceability.getCategory()));
        }
        return arrayList;
    }
}
