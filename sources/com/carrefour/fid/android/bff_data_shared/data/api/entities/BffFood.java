package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.compose.p004ui.graphics.C15307r2;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 2\u00020\u0001:\u0003\u0001B\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010#¢\u0006\u0004\by\u0010zB¯\u0002\b\u0017\u0012\u0006\u0010{\u001a\u00020\u0017\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010#\u0012\b\u0010}\u001a\u0004\u0018\u00010|¢\u0006\u0004\by\u0010~J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010#HÆ\u0003J¤\u0002\u0010<\u001a\u00020\u00002\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010#HÆ\u0001¢\u0006\u0004\b<\u0010=J\t\u0010>\u001a\u00020\tHÖ\u0001J\t\u0010?\u001a\u00020\u0017HÖ\u0001J\u0013\u0010B\u001a\u00020A2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010%\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010C\u0012\u0004\bF\u0010G\u001a\u0004\bD\u0010ER\"\u0010&\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010C\u0012\u0004\bI\u0010G\u001a\u0004\bH\u0010ER\"\u0010'\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010C\u0012\u0004\bK\u0010G\u001a\u0004\bJ\u0010ER\"\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010C\u0012\u0004\bM\u0010G\u001a\u0004\bL\u0010ER\"\u0010)\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010C\u0012\u0004\bO\u0010G\u001a\u0004\bN\u0010ER\"\u0010*\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010C\u0012\u0004\bQ\u0010G\u001a\u0004\bP\u0010ER\"\u0010+\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010C\u0012\u0004\bS\u0010G\u001a\u0004\bR\u0010ER\"\u0010,\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010C\u0012\u0004\bU\u0010G\u001a\u0004\bT\u0010ER\"\u0010-\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010V\u0012\u0004\bY\u0010G\u001a\u0004\bW\u0010XR\"\u0010.\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010C\u0012\u0004\b[\u0010G\u001a\u0004\bZ\u0010ER\"\u0010/\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010C\u0012\u0004\b]\u0010G\u001a\u0004\b\\\u0010ER\"\u00100\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010C\u0012\u0004\b_\u0010G\u001a\u0004\b^\u0010ER\"\u00101\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010`\u0012\u0004\bb\u0010G\u001a\u0004\ba\u0010\u0019R\"\u00102\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010C\u0012\u0004\bd\u0010G\u001a\u0004\bc\u0010ER\"\u00103\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010C\u0012\u0004\bf\u0010G\u001a\u0004\be\u0010ER\"\u00104\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010C\u0012\u0004\bh\u0010G\u001a\u0004\bg\u0010ER\"\u00105\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010C\u0012\u0004\bj\u0010G\u001a\u0004\bi\u0010ER\"\u00106\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010C\u0012\u0004\bl\u0010G\u001a\u0004\bk\u0010ER\"\u00107\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010C\u0012\u0004\bn\u0010G\u001a\u0004\bm\u0010ER\"\u00108\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010C\u0012\u0004\bp\u0010G\u001a\u0004\bo\u0010ER\"\u00109\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010C\u0012\u0004\br\u0010G\u001a\u0004\bq\u0010ER\"\u0010:\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010C\u0012\u0004\bt\u0010G\u001a\u0004\bs\u0010ER\"\u0010;\u001a\u0004\u0018\u00010#8\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010u\u0012\u0004\bx\u0010G\u001a\u0004\bv\u0010w¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFood;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffIngredients;", "component9", "component10", "component11", "component12", "", "component13", "()Ljava/lang/Integer;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTables;", "component23", "category", "caliber", "variety", "latinName", "farmedFish", "texture", "consumptionUnit", "baseOfTheDish", "ingredients", "nutriscore", "wineFoodMatch", "wineAward", "wineRack", "wineYear", "containerType", "facetMillesime", "wineCepage", "wineColor", "alcoholDegree", "champagneType", "wineRegion", "percentageAlcoholVolume", "nutritionalTables", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffIngredients;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTables;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFood;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "getCategory$annotations", "()V", "getCaliber", "getCaliber$annotations", "getVariety", "getVariety$annotations", "getLatinName", "getLatinName$annotations", "getFarmedFish", "getFarmedFish$annotations", "getTexture", "getTexture$annotations", "getConsumptionUnit", "getConsumptionUnit$annotations", "getBaseOfTheDish", "getBaseOfTheDish$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffIngredients;", "getIngredients", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffIngredients;", "getIngredients$annotations", "getNutriscore", "getNutriscore$annotations", "getWineFoodMatch", "getWineFoodMatch$annotations", "getWineAward", "getWineAward$annotations", "Ljava/lang/Integer;", "getWineRack", "getWineRack$annotations", "getWineYear", "getWineYear$annotations", "getContainerType", "getContainerType$annotations", "getFacetMillesime", "getFacetMillesime$annotations", "getWineCepage", "getWineCepage$annotations", "getWineColor", "getWineColor$annotations", "getAlcoholDegree", "getAlcoholDegree$annotations", "getChampagneType", "getChampagneType$annotations", "getWineRegion", "getWineRegion$annotations", "getPercentageAlcoholVolume", "getPercentageAlcoholVolume$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTables;", "getNutritionalTables", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTables;", "getNutritionalTables$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffIngredients;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTables;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffIngredients;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFoodNutritionalTables;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffFood {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String alcoholDegree;
    @C12580l
    private final String baseOfTheDish;
    @C12580l
    private final String caliber;
    @C12580l
    private final String category;
    @C12580l
    private final String champagneType;
    @C12580l
    private final String consumptionUnit;
    @C12580l
    private final String containerType;
    @C12580l
    private final String facetMillesime;
    @C12580l
    private final String farmedFish;
    @C12580l
    private final BffIngredients ingredients;
    @C12580l
    private final String latinName;
    @C12580l
    private final String nutriscore;
    @C12580l
    private final BffFoodNutritionalTables nutritionalTables;
    @C12580l
    private final String percentageAlcoholVolume;
    @C12580l
    private final String texture;
    @C12580l
    private final String variety;
    @C12580l
    private final String wineAward;
    @C12580l
    private final String wineCepage;
    @C12580l
    private final String wineColor;
    @C12580l
    private final String wineFoodMatch;
    @C12580l
    private final Integer wineRack;
    @C12580l
    private final String wineRegion;
    @C12580l
    private final String wineYear;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFood$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFood;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffFood> serializer() {
            return BffFood$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffFood() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BffIngredients) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BffFoodNutritionalTables) null, (int) C15307r2.f37674R0, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffFood copy$default(BffFood bffFood, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BffIngredients bffIngredients, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, BffFoodNutritionalTables bffFoodNutritionalTables, int i, Object obj) {
        BffFood bffFood2 = bffFood;
        int i2 = i;
        return bffFood.copy((i2 & 1) != 0 ? bffFood2.category : str, (i2 & 2) != 0 ? bffFood2.caliber : str2, (i2 & 4) != 0 ? bffFood2.variety : str3, (i2 & 8) != 0 ? bffFood2.latinName : str4, (i2 & 16) != 0 ? bffFood2.farmedFish : str5, (i2 & 32) != 0 ? bffFood2.texture : str6, (i2 & 64) != 0 ? bffFood2.consumptionUnit : str7, (i2 & 128) != 0 ? bffFood2.baseOfTheDish : str8, (i2 & 256) != 0 ? bffFood2.ingredients : bffIngredients, (i2 & 512) != 0 ? bffFood2.nutriscore : str9, (i2 & 1024) != 0 ? bffFood2.wineFoodMatch : str10, (i2 & 2048) != 0 ? bffFood2.wineAward : str11, (i2 & 4096) != 0 ? bffFood2.wineRack : num, (i2 & 8192) != 0 ? bffFood2.wineYear : str12, (i2 & 16384) != 0 ? bffFood2.containerType : str13, (i2 & 32768) != 0 ? bffFood2.facetMillesime : str14, (i2 & 65536) != 0 ? bffFood2.wineCepage : str15, (i2 & 131072) != 0 ? bffFood2.wineColor : str16, (i2 & 262144) != 0 ? bffFood2.alcoholDegree : str17, (i2 & 524288) != 0 ? bffFood2.champagneType : str18, (i2 & 1048576) != 0 ? bffFood2.wineRegion : str19, (i2 & 2097152) != 0 ? bffFood2.percentageAlcoholVolume : str20, (i2 & 4194304) != 0 ? bffFood2.nutritionalTables : bffFoodNutritionalTables);
    }

    @C12438n("alcohol_degree")
    public static /* synthetic */ void getAlcoholDegree$annotations() {
    }

    @C12438n("base_of_the_dish")
    public static /* synthetic */ void getBaseOfTheDish$annotations() {
    }

    @C12438n("caliber")
    public static /* synthetic */ void getCaliber$annotations() {
    }

    @C12438n("category")
    public static /* synthetic */ void getCategory$annotations() {
    }

    @C12438n("champagne_type")
    public static /* synthetic */ void getChampagneType$annotations() {
    }

    @C12438n("consumption_unit")
    public static /* synthetic */ void getConsumptionUnit$annotations() {
    }

    @C12438n("container_type")
    public static /* synthetic */ void getContainerType$annotations() {
    }

    @C12438n("facet_millesime")
    public static /* synthetic */ void getFacetMillesime$annotations() {
    }

    @C12438n("farmed_fish")
    public static /* synthetic */ void getFarmedFish$annotations() {
    }

    @C12438n("ingredients")
    public static /* synthetic */ void getIngredients$annotations() {
    }

    @C12438n("latin_name")
    public static /* synthetic */ void getLatinName$annotations() {
    }

    @C12438n("nutriscore")
    public static /* synthetic */ void getNutriscore$annotations() {
    }

    @C12438n("nutritional_tables")
    public static /* synthetic */ void getNutritionalTables$annotations() {
    }

    @C12438n("percentage_alcohol_volume")
    public static /* synthetic */ void getPercentageAlcoholVolume$annotations() {
    }

    @C12438n("texture")
    public static /* synthetic */ void getTexture$annotations() {
    }

    @C12438n("variety")
    public static /* synthetic */ void getVariety$annotations() {
    }

    @C12438n("wine_award")
    public static /* synthetic */ void getWineAward$annotations() {
    }

    @C12438n("wine_cepage")
    public static /* synthetic */ void getWineCepage$annotations() {
    }

    @C12438n("wine_color")
    public static /* synthetic */ void getWineColor$annotations() {
    }

    @C12438n("wine_food_match")
    public static /* synthetic */ void getWineFoodMatch$annotations() {
    }

    @C12438n("wine_rack")
    public static /* synthetic */ void getWineRack$annotations() {
    }

    @C12438n("wine_region")
    public static /* synthetic */ void getWineRegion$annotations() {
    }

    @C12438n("wine_year")
    public static /* synthetic */ void getWineYear$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffFood bffFood, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffFood.category != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffFood.category);
        }
        if (dVar.mo24897A(fVar, 1) || bffFood.caliber != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffFood.caliber);
        }
        if (dVar.mo24897A(fVar, 2) || bffFood.variety != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffFood.variety);
        }
        if (dVar.mo24897A(fVar, 3) || bffFood.latinName != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffFood.latinName);
        }
        if (dVar.mo24897A(fVar, 4) || bffFood.farmedFish != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffFood.farmedFish);
        }
        if (dVar.mo24897A(fVar, 5) || bffFood.texture != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffFood.texture);
        }
        if (dVar.mo24897A(fVar, 6) || bffFood.consumptionUnit != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffFood.consumptionUnit);
        }
        if (dVar.mo24897A(fVar, 7) || bffFood.baseOfTheDish != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffFood.baseOfTheDish);
        }
        if (dVar.mo24897A(fVar, 8) || bffFood.ingredients != null) {
            dVar.mo24912i(fVar, 8, BffIngredients$$serializer.INSTANCE, bffFood.ingredients);
        }
        if (dVar.mo24897A(fVar, 9) || bffFood.nutriscore != null) {
            dVar.mo24912i(fVar, 9, C12310s1.f30117a, bffFood.nutriscore);
        }
        if (dVar.mo24897A(fVar, 10) || bffFood.wineFoodMatch != null) {
            dVar.mo24912i(fVar, 10, C12310s1.f30117a, bffFood.wineFoodMatch);
        }
        if (dVar.mo24897A(fVar, 11) || bffFood.wineAward != null) {
            dVar.mo24912i(fVar, 11, C12310s1.f30117a, bffFood.wineAward);
        }
        if (dVar.mo24897A(fVar, 12) || bffFood.wineRack != null) {
            dVar.mo24912i(fVar, 12, C12276h0.f30067a, bffFood.wineRack);
        }
        if (dVar.mo24897A(fVar, 13) || bffFood.wineYear != null) {
            dVar.mo24912i(fVar, 13, C12310s1.f30117a, bffFood.wineYear);
        }
        if (dVar.mo24897A(fVar, 14) || bffFood.containerType != null) {
            dVar.mo24912i(fVar, 14, C12310s1.f30117a, bffFood.containerType);
        }
        if (dVar.mo24897A(fVar, 15) || bffFood.facetMillesime != null) {
            dVar.mo24912i(fVar, 15, C12310s1.f30117a, bffFood.facetMillesime);
        }
        if (dVar.mo24897A(fVar, 16) || bffFood.wineCepage != null) {
            dVar.mo24912i(fVar, 16, C12310s1.f30117a, bffFood.wineCepage);
        }
        if (dVar.mo24897A(fVar, 17) || bffFood.wineColor != null) {
            dVar.mo24912i(fVar, 17, C12310s1.f30117a, bffFood.wineColor);
        }
        if (dVar.mo24897A(fVar, 18) || bffFood.alcoholDegree != null) {
            dVar.mo24912i(fVar, 18, C12310s1.f30117a, bffFood.alcoholDegree);
        }
        if (dVar.mo24897A(fVar, 19) || bffFood.champagneType != null) {
            dVar.mo24912i(fVar, 19, C12310s1.f30117a, bffFood.champagneType);
        }
        if (dVar.mo24897A(fVar, 20) || bffFood.wineRegion != null) {
            dVar.mo24912i(fVar, 20, C12310s1.f30117a, bffFood.wineRegion);
        }
        if (dVar.mo24897A(fVar, 21) || bffFood.percentageAlcoholVolume != null) {
            dVar.mo24912i(fVar, 21, C12310s1.f30117a, bffFood.percentageAlcoholVolume);
        }
        if (dVar.mo24897A(fVar, 22) || bffFood.nutritionalTables != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 22, BffFoodNutritionalTables$$serializer.INSTANCE, bffFood.nutritionalTables);
        }
    }

    @C12580l
    public final String component1() {
        return this.category;
    }

    @C12580l
    public final String component10() {
        return this.nutriscore;
    }

    @C12580l
    public final String component11() {
        return this.wineFoodMatch;
    }

    @C12580l
    public final String component12() {
        return this.wineAward;
    }

    @C12580l
    public final Integer component13() {
        return this.wineRack;
    }

    @C12580l
    public final String component14() {
        return this.wineYear;
    }

    @C12580l
    public final String component15() {
        return this.containerType;
    }

    @C12580l
    public final String component16() {
        return this.facetMillesime;
    }

    @C12580l
    public final String component17() {
        return this.wineCepage;
    }

    @C12580l
    public final String component18() {
        return this.wineColor;
    }

    @C12580l
    public final String component19() {
        return this.alcoholDegree;
    }

    @C12580l
    public final String component2() {
        return this.caliber;
    }

    @C12580l
    public final String component20() {
        return this.champagneType;
    }

    @C12580l
    public final String component21() {
        return this.wineRegion;
    }

    @C12580l
    public final String component22() {
        return this.percentageAlcoholVolume;
    }

    @C12580l
    public final BffFoodNutritionalTables component23() {
        return this.nutritionalTables;
    }

    @C12580l
    public final String component3() {
        return this.variety;
    }

    @C12580l
    public final String component4() {
        return this.latinName;
    }

    @C12580l
    public final String component5() {
        return this.farmedFish;
    }

    @C12580l
    public final String component6() {
        return this.texture;
    }

    @C12580l
    public final String component7() {
        return this.consumptionUnit;
    }

    @C12580l
    public final String component8() {
        return this.baseOfTheDish;
    }

    @C12580l
    public final BffIngredients component9() {
        return this.ingredients;
    }

    @C12579k
    public final BffFood copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l BffIngredients bffIngredients, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l Integer num, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17, @C12580l String str18, @C12580l String str19, @C12580l String str20, @C12580l BffFoodNutritionalTables bffFoodNutritionalTables) {
        return new BffFood(str, str2, str3, str4, str5, str6, str7, str8, bffIngredients, str9, str10, str11, num, str12, str13, str14, str15, str16, str17, str18, str19, str20, bffFoodNutritionalTables);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffFood)) {
            return false;
        }
        BffFood bffFood = (BffFood) obj;
        return Intrinsics.areEqual((Object) this.category, (Object) bffFood.category) && Intrinsics.areEqual((Object) this.caliber, (Object) bffFood.caliber) && Intrinsics.areEqual((Object) this.variety, (Object) bffFood.variety) && Intrinsics.areEqual((Object) this.latinName, (Object) bffFood.latinName) && Intrinsics.areEqual((Object) this.farmedFish, (Object) bffFood.farmedFish) && Intrinsics.areEqual((Object) this.texture, (Object) bffFood.texture) && Intrinsics.areEqual((Object) this.consumptionUnit, (Object) bffFood.consumptionUnit) && Intrinsics.areEqual((Object) this.baseOfTheDish, (Object) bffFood.baseOfTheDish) && Intrinsics.areEqual((Object) this.ingredients, (Object) bffFood.ingredients) && Intrinsics.areEqual((Object) this.nutriscore, (Object) bffFood.nutriscore) && Intrinsics.areEqual((Object) this.wineFoodMatch, (Object) bffFood.wineFoodMatch) && Intrinsics.areEqual((Object) this.wineAward, (Object) bffFood.wineAward) && Intrinsics.areEqual((Object) this.wineRack, (Object) bffFood.wineRack) && Intrinsics.areEqual((Object) this.wineYear, (Object) bffFood.wineYear) && Intrinsics.areEqual((Object) this.containerType, (Object) bffFood.containerType) && Intrinsics.areEqual((Object) this.facetMillesime, (Object) bffFood.facetMillesime) && Intrinsics.areEqual((Object) this.wineCepage, (Object) bffFood.wineCepage) && Intrinsics.areEqual((Object) this.wineColor, (Object) bffFood.wineColor) && Intrinsics.areEqual((Object) this.alcoholDegree, (Object) bffFood.alcoholDegree) && Intrinsics.areEqual((Object) this.champagneType, (Object) bffFood.champagneType) && Intrinsics.areEqual((Object) this.wineRegion, (Object) bffFood.wineRegion) && Intrinsics.areEqual((Object) this.percentageAlcoholVolume, (Object) bffFood.percentageAlcoholVolume) && Intrinsics.areEqual((Object) this.nutritionalTables, (Object) bffFood.nutritionalTables);
    }

    @C12580l
    public final String getAlcoholDegree() {
        return this.alcoholDegree;
    }

    @C12580l
    public final String getBaseOfTheDish() {
        return this.baseOfTheDish;
    }

    @C12580l
    public final String getCaliber() {
        return this.caliber;
    }

    @C12580l
    public final String getCategory() {
        return this.category;
    }

    @C12580l
    public final String getChampagneType() {
        return this.champagneType;
    }

    @C12580l
    public final String getConsumptionUnit() {
        return this.consumptionUnit;
    }

    @C12580l
    public final String getContainerType() {
        return this.containerType;
    }

    @C12580l
    public final String getFacetMillesime() {
        return this.facetMillesime;
    }

    @C12580l
    public final String getFarmedFish() {
        return this.farmedFish;
    }

    @C12580l
    public final BffIngredients getIngredients() {
        return this.ingredients;
    }

    @C12580l
    public final String getLatinName() {
        return this.latinName;
    }

    @C12580l
    public final String getNutriscore() {
        return this.nutriscore;
    }

    @C12580l
    public final BffFoodNutritionalTables getNutritionalTables() {
        return this.nutritionalTables;
    }

    @C12580l
    public final String getPercentageAlcoholVolume() {
        return this.percentageAlcoholVolume;
    }

    @C12580l
    public final String getTexture() {
        return this.texture;
    }

    @C12580l
    public final String getVariety() {
        return this.variety;
    }

    @C12580l
    public final String getWineAward() {
        return this.wineAward;
    }

    @C12580l
    public final String getWineCepage() {
        return this.wineCepage;
    }

    @C12580l
    public final String getWineColor() {
        return this.wineColor;
    }

    @C12580l
    public final String getWineFoodMatch() {
        return this.wineFoodMatch;
    }

    @C12580l
    public final Integer getWineRack() {
        return this.wineRack;
    }

    @C12580l
    public final String getWineRegion() {
        return this.wineRegion;
    }

    @C12580l
    public final String getWineYear() {
        return this.wineYear;
    }

    public int hashCode() {
        String str = this.category;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.caliber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.variety;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.latinName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.farmedFish;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.texture;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.consumptionUnit;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.baseOfTheDish;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BffIngredients bffIngredients = this.ingredients;
        int hashCode9 = (hashCode8 + (bffIngredients == null ? 0 : bffIngredients.hashCode())) * 31;
        String str9 = this.nutriscore;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.wineFoodMatch;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.wineAward;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.wineRack;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str12 = this.wineYear;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.containerType;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.facetMillesime;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.wineCepage;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.wineColor;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.alcoholDegree;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.champagneType;
        int hashCode20 = (hashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.wineRegion;
        int hashCode21 = (hashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.percentageAlcoholVolume;
        int hashCode22 = (hashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        BffFoodNutritionalTables bffFoodNutritionalTables = this.nutritionalTables;
        if (bffFoodNutritionalTables != null) {
            i = bffFoodNutritionalTables.hashCode();
        }
        return hashCode22 + i;
    }

    @C12579k
    public String toString() {
        String str = this.category;
        String str2 = this.caliber;
        String str3 = this.variety;
        String str4 = this.latinName;
        String str5 = this.farmedFish;
        String str6 = this.texture;
        String str7 = this.consumptionUnit;
        String str8 = this.baseOfTheDish;
        BffIngredients bffIngredients = this.ingredients;
        String str9 = this.nutriscore;
        String str10 = this.wineFoodMatch;
        String str11 = this.wineAward;
        Integer num = this.wineRack;
        String str12 = this.wineYear;
        String str13 = this.containerType;
        String str14 = this.facetMillesime;
        String str15 = this.wineCepage;
        String str16 = this.wineColor;
        String str17 = this.alcoholDegree;
        String str18 = this.champagneType;
        String str19 = this.wineRegion;
        String str20 = this.percentageAlcoholVolume;
        BffFoodNutritionalTables bffFoodNutritionalTables = this.nutritionalTables;
        return "BffFood(category=" + str + ", caliber=" + str2 + ", variety=" + str3 + ", latinName=" + str4 + ", farmedFish=" + str5 + ", texture=" + str6 + ", consumptionUnit=" + str7 + ", baseOfTheDish=" + str8 + ", ingredients=" + bffIngredients + ", nutriscore=" + str9 + ", wineFoodMatch=" + str10 + ", wineAward=" + str11 + ", wineRack=" + num + ", wineYear=" + str12 + ", containerType=" + str13 + ", facetMillesime=" + str14 + ", wineCepage=" + str15 + ", wineColor=" + str16 + ", alcoholDegree=" + str17 + ", champagneType=" + str18 + ", wineRegion=" + str19 + ", percentageAlcoholVolume=" + str20 + ", nutritionalTables=" + bffFoodNutritionalTables + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffFood(int i, @C12438n("category") String str, @C12438n("caliber") String str2, @C12438n("variety") String str3, @C12438n("latin_name") String str4, @C12438n("farmed_fish") String str5, @C12438n("texture") String str6, @C12438n("consumption_unit") String str7, @C12438n("base_of_the_dish") String str8, @C12438n("ingredients") BffIngredients bffIngredients, @C12438n("nutriscore") String str9, @C12438n("wine_food_match") String str10, @C12438n("wine_award") String str11, @C12438n("wine_rack") Integer num, @C12438n("wine_year") String str12, @C12438n("container_type") String str13, @C12438n("facet_millesime") String str14, @C12438n("wine_cepage") String str15, @C12438n("wine_color") String str16, @C12438n("alcohol_degree") String str17, @C12438n("champagne_type") String str18, @C12438n("wine_region") String str19, @C12438n("percentage_alcohol_volume") String str20, @C12438n("nutritional_tables") BffFoodNutritionalTables bffFoodNutritionalTables, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffFood$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.category = null;
        } else {
            this.category = str;
        }
        if ((i2 & 2) == 0) {
            this.caliber = null;
        } else {
            this.caliber = str2;
        }
        if ((i2 & 4) == 0) {
            this.variety = null;
        } else {
            this.variety = str3;
        }
        if ((i2 & 8) == 0) {
            this.latinName = null;
        } else {
            this.latinName = str4;
        }
        if ((i2 & 16) == 0) {
            this.farmedFish = null;
        } else {
            this.farmedFish = str5;
        }
        if ((i2 & 32) == 0) {
            this.texture = null;
        } else {
            this.texture = str6;
        }
        if ((i2 & 64) == 0) {
            this.consumptionUnit = null;
        } else {
            this.consumptionUnit = str7;
        }
        if ((i2 & 128) == 0) {
            this.baseOfTheDish = null;
        } else {
            this.baseOfTheDish = str8;
        }
        if ((i2 & 256) == 0) {
            this.ingredients = null;
        } else {
            this.ingredients = bffIngredients;
        }
        if ((i2 & 512) == 0) {
            this.nutriscore = null;
        } else {
            this.nutriscore = str9;
        }
        if ((i2 & 1024) == 0) {
            this.wineFoodMatch = null;
        } else {
            this.wineFoodMatch = str10;
        }
        if ((i2 & 2048) == 0) {
            this.wineAward = null;
        } else {
            this.wineAward = str11;
        }
        if ((i2 & 4096) == 0) {
            this.wineRack = null;
        } else {
            this.wineRack = num;
        }
        if ((i2 & 8192) == 0) {
            this.wineYear = null;
        } else {
            this.wineYear = str12;
        }
        if ((i2 & 16384) == 0) {
            this.containerType = null;
        } else {
            this.containerType = str13;
        }
        if ((32768 & i2) == 0) {
            this.facetMillesime = null;
        } else {
            this.facetMillesime = str14;
        }
        if ((65536 & i2) == 0) {
            this.wineCepage = null;
        } else {
            this.wineCepage = str15;
        }
        if ((131072 & i2) == 0) {
            this.wineColor = null;
        } else {
            this.wineColor = str16;
        }
        if ((262144 & i2) == 0) {
            this.alcoholDegree = null;
        } else {
            this.alcoholDegree = str17;
        }
        if ((524288 & i2) == 0) {
            this.champagneType = null;
        } else {
            this.champagneType = str18;
        }
        if ((1048576 & i2) == 0) {
            this.wineRegion = null;
        } else {
            this.wineRegion = str19;
        }
        if ((2097152 & i2) == 0) {
            this.percentageAlcoholVolume = null;
        } else {
            this.percentageAlcoholVolume = str20;
        }
        if ((i2 & 4194304) == 0) {
            this.nutritionalTables = null;
        } else {
            this.nutritionalTables = bffFoodNutritionalTables;
        }
    }

    public BffFood(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l BffIngredients bffIngredients, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l Integer num, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17, @C12580l String str18, @C12580l String str19, @C12580l String str20, @C12580l BffFoodNutritionalTables bffFoodNutritionalTables) {
        this.category = str;
        this.caliber = str2;
        this.variety = str3;
        this.latinName = str4;
        this.farmedFish = str5;
        this.texture = str6;
        this.consumptionUnit = str7;
        this.baseOfTheDish = str8;
        this.ingredients = bffIngredients;
        this.nutriscore = str9;
        this.wineFoodMatch = str10;
        this.wineAward = str11;
        this.wineRack = num;
        this.wineYear = str12;
        this.containerType = str13;
        this.facetMillesime = str14;
        this.wineCepage = str15;
        this.wineColor = str16;
        this.alcoholDegree = str17;
        this.champagneType = str18;
        this.wineRegion = str19;
        this.percentageAlcoholVolume = str20;
        this.nutritionalTables = bffFoodNutritionalTables;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffFood(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.Integer r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTables r47, int r48, kotlin.jvm.internal.DefaultConstructorMarker r49) {
        /*
            r24 = this;
            r0 = r48
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r25
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r26
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r27
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r28
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r29
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r30
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r31
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r32
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r33
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r34
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r35
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r36
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r37
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r38
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r39
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r40
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r41
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r42
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r43
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r44
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r45
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r46
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r23
            if (r0 == 0) goto L_0x00d0
            r0 = 0
            goto L_0x00d2
        L_0x00d0:
            r0 = r47
        L_0x00d2:
            r25 = r24
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r6
            r31 = r7
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r11
            r36 = r12
            r37 = r13
            r38 = r14
            r39 = r15
            r40 = r2
            r41 = r16
            r42 = r17
            r43 = r18
            r44 = r19
            r45 = r20
            r46 = r21
            r47 = r22
            r48 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFoodNutritionalTables, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
