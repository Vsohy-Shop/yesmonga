package com.carrefour.fid.android.presentation.models.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.extension.C37507h;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.presentation.models.OfferDepartmentModel;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.OfferUnavailableModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOfferListModelDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferListModelDataMapper.kt\ncom/carrefour/fid/android/presentation/models/mapper/OfferListModelDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n766#2:97\n857#2,2:98\n766#2:100\n857#2,2:101\n819#2:103\n847#2,2:104\n819#2:106\n847#2,2:107\n800#2,11:109\n*S KotlinDebug\n*F\n+ 1 OfferListModelDataMapper.kt\ncom/carrefour/fid/android/presentation/models/mapper/OfferListModelDataMapper\n*L\n54#1:97\n54#1:98,2\n57#1:100\n57#1:101,2\n68#1:103\n68#1:104,2\n71#1:106\n71#1:107,2\n88#1:109,11\n*E\n"})
public final class OfferListModelDataMapper {

    /* renamed from: a */
    public static final int f97630a = 0;

    @C11395k(message = "Moved into [domain-shared]", replaceWith = @C11587t0(expression = "AvailableType", imports = {"com.carrefour.fid.android.domain.models.offer.AvailableType"}))
    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/mapper/OfferListModelDataMapper$AvailableType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum AvailableType {
        DEFAULT,
        WITH_DEPARTMENTS
    }

    @C11395k(message = "Moved into [domain-shared]", replaceWith = @C11587t0(expression = "UnavailableType", imports = {"com.carrefour.fid.android.domain.models.offer.AvailableType"}))
    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/mapper/OfferListModelDataMapper$UnavailableType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum UnavailableType {
        BOTTOM_AS_DEPARTMENT,
        DEFAULT,
        HEADER_LIST,
        HEADER_LIST_WITH_DEPARTMENTS,
        NONE
    }

    /* renamed from: b */
    public static /* synthetic */ List m159724b(OfferListModelDataMapper offerListModelDataMapper, List list, AvailableType availableType, UnavailableType unavailableType, int i, Object obj) {
        if ((i & 2) != 0) {
            availableType = AvailableType.DEFAULT;
        }
        if ((i & 4) != 0) {
            unavailableType = UnavailableType.DEFAULT;
        }
        return offerListModelDataMapper.mo122117a(list, availableType, unavailableType);
    }

    @C12579k
    /* renamed from: a */
    public final List<OfferModel> mo122117a(@C12579k List<OfferProductDomain> list, @C12579k AvailableType availableType, @C12579k UnavailableType unavailableType) {
        List<OfferModel> list2;
        List<OfferModel> list3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(list, "source");
        Intrinsics.checkNotNullParameter(availableType, "availableType");
        Intrinsics.checkNotNullParameter(unavailableType, "unavailableType");
        List<OfferProductModel> i = C37507h.m153957i(list);
        if (unavailableType != UnavailableType.DEFAULT) {
            if (availableType == AvailableType.WITH_DEPARTMENTS) {
                ArrayList arrayList = new ArrayList();
                for (Object next : i) {
                    if (((OfferProductModel) next).mo121509g() == OfferAvailability.AVAILABLE) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        arrayList.add(next);
                    }
                }
                list2 = OfferProductModelKt.m159577Z(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : i) {
                    if (((OfferProductModel) next2).mo121509g() == OfferAvailability.AVAILABLE) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        arrayList2.add(next2);
                    }
                }
                list2 = arrayList2;
            }
            if (unavailableType != UnavailableType.NONE) {
                if (unavailableType == UnavailableType.HEADER_LIST_WITH_DEPARTMENTS) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object next3 : i) {
                        if (((OfferProductModel) next3).mo121509g() == OfferAvailability.AVAILABLE) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            arrayList3.add(next3);
                        }
                    }
                    list3 = OfferProductModelKt.m159577Z(arrayList3);
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object next4 : i) {
                        if (((OfferProductModel) next4).mo121509g() == OfferAvailability.AVAILABLE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            arrayList4.add(next4);
                        }
                    }
                    list3 = arrayList4;
                }
                if (!list3.isEmpty()) {
                    if (unavailableType == UnavailableType.HEADER_LIST || unavailableType == UnavailableType.HEADER_LIST_WITH_DEPARTMENTS) {
                        return CollectionsKt___CollectionsKt.m40718y4(C10976s.m41419k(new OfferUnavailableModel(list3, false, 2, (DefaultConstructorMarker) null)), list2);
                    }
                    if (unavailableType == UnavailableType.BOTTOM_AS_DEPARTMENT) {
                        Collection collection = list2;
                        Iterable iterable = list3;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object next5 : iterable) {
                            if (next5 instanceof OfferProductModel) {
                                arrayList5.add(next5);
                            }
                        }
                        return CollectionsKt___CollectionsKt.m40718y4(CollectionsKt___CollectionsKt.m40723z4(collection, new OfferDepartmentModel((String) null, (String) null, arrayList5.size(), 0.0d, 11, (DefaultConstructorMarker) null)), iterable);
                    }
                    throw new Throwable("Magic exception");
                }
            }
            return list2;
        } else if (availableType == AvailableType.WITH_DEPARTMENTS) {
            return OfferProductModelKt.m159577Z(i);
        } else {
            return i;
        }
    }
}
