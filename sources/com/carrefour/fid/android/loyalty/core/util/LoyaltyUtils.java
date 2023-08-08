package com.carrefour.fid.android.loyalty.core.util;

import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.domain.models.account.UserCards;
import com.carrefour.fid.android.loyalty.core.type.CardType;
import com.carrefour.fid.android.loyalty.data.models.entities.ClubsResponse;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import com.journeyapps.barcodescanner.camera.C34935s;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J<\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bJ.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\rH\u0007J\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\rJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0004J$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\r*\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\r¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/core/util/LoyaltyUtils;", "", "()V", "buildCardNumberWithPrefix", "", "cardNumber", "typeCard", "", "filterMidFidPrimesList", "Ljava/util/ArrayList;", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "Lkotlin/collections/ArrayList;", "clubList", "", "Lcom/carrefour/fid/android/loyalty/data/models/entities/ClubsResponse;", "primeCmsList", "filterPrimesFidList", "primeList", "getMostRecentAndSecuredLoyaltyCard", "Lcom/carrefour/fid/android/domain/models/account/UserCards;", "list", "getPassCardNumber", "getTypeCard", "getTypeCardName", "isFromBasketV4", "", "initUserCard", "luhn", "s", "filterLoyaltyBonusList", "Lcom/carrefour/fid/android/cms/domain/models/LoyaltyBonus;", "loyaltyBonusList", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLoyaltyUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyUtils.kt\ncom/carrefour/fid/android/loyalty/core/util/LoyaltyUtils\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n451#2:182\n462#2:183\n1183#2,2:184\n463#2,2:186\n1185#2:188\n465#2:189\n2104#2,5:190\n451#2:195\n462#2:196\n1183#2,2:197\n463#2,2:199\n1185#2:201\n465#2:202\n970#2:203\n1041#2,3:204\n1855#3:207\n1747#3,3:208\n1856#3:211\n1855#3:212\n766#3:213\n857#3,2:214\n1747#3,3:216\n1856#3:219\n1855#3:220\n766#3:221\n857#3,2:222\n1747#3,3:224\n1856#3:227\n766#3:228\n857#3,2:229\n1963#3,14:231\n*S KotlinDebug\n*F\n+ 1 LoyaltyUtils.kt\ncom/carrefour/fid/android/loyalty/core/util/LoyaltyUtils\n*L\n128#1:182\n128#1:183\n128#1:184,2\n128#1:186,2\n128#1:188\n128#1:189\n128#1:190,5\n129#1:195\n129#1:196\n129#1:197,2\n129#1:199,2\n129#1:201\n129#1:202\n129#1:203\n129#1:204,3\n139#1:207\n140#1:208,3\n139#1:211\n152#1:212\n153#1:213\n153#1:214,2\n154#1:216,3\n152#1:219\n165#1:220\n166#1:221\n166#1:222,2\n166#1:224,3\n165#1:227\n174#1:228\n174#1:229,2\n174#1:231,14\n*E\n"})
public final class LoyaltyUtils {
    @C12579k
    public static final LoyaltyUtils INSTANCE = new LoyaltyUtils();

    private LoyaltyUtils() {
    }

    public static /* synthetic */ String getTypeCardName$default(LoyaltyUtils loyaltyUtils, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return loyaltyUtils.getTypeCardName(str, z);
    }

    private static final int luhn$sumDigits(int i) {
        return (i / 10) + (i % 10);
    }

    @C12579k
    public final String buildCardNumberWithPrefix(@C12579k String str, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
        LoyaltyCardType loyaltyCardType = LoyaltyCardType.PASS;
        if (i == loyaltyCardType.getType() && str.length() == 16) {
            z = true;
        } else {
            z = false;
        }
        if (i == loyaltyCardType.getType() && str.length() == 19) {
            boolean areEqual = Intrinsics.areEqual((Object) str.subSequence(0, 2), (Object) "103");
        }
        if (true != z) {
            return str;
        }
        return "103" + str;
    }

    @C12579k
    public final List<LoyaltyBonus> filterLoyaltyBonusList(@C12579k List<ClubsResponse> list, @C12579k List<LoyaltyBonus> list2) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(list2, "loyaltyBonusList");
        for (LoyaltyBonus loyaltyBonus : list2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean z2 = true;
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ClubsResponse) next).getUnsubscribeDate().length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.areEqual((Object) ((ClubsResponse) it2.next()).getClubName(), (Object) loyaltyBonus.getPrimeId())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                loyaltyBonus.setSelected(true);
            }
        }
        return list2;
    }

    @C12579k
    public final ArrayList<DataPrimeCmsResponse> filterMidFidPrimesList(@C12579k List<ClubsResponse> list, @C12579k ArrayList<DataPrimeCmsResponse> arrayList) {
        Intrinsics.checkNotNullParameter(list, "clubList");
        Intrinsics.checkNotNullParameter(arrayList, "primeCmsList");
        for (DataPrimeCmsResponse dataPrimeCmsResponse : arrayList) {
            Iterable iterable = list;
            boolean z = false;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Intrinsics.areEqual((Object) ((ClubsResponse) it.next()).getClubName(), (Object) dataPrimeCmsResponse.getPrimeId())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                dataPrimeCmsResponse.setSelected(true);
            }
        }
        return arrayList;
    }

    @C11395k(message = "Please use filterLoyaltyBonusList")
    @C12579k
    public final List<DataPrimeCmsResponse> filterPrimesFidList(@C12580l List<ClubsResponse> list, @C12580l List<DataPrimeCmsResponse> list2) {
        List<DataPrimeCmsResponse> list3;
        boolean z;
        if (list != null) {
            if (list2 != null) {
                for (DataPrimeCmsResponse dataPrimeCmsResponse : list2) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean z2 = true;
                        z = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((ClubsResponse) next).getUnsubscribeDate().length() != 0) {
                            z2 = false;
                        }
                        if (z2) {
                            arrayList.add(next);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (Intrinsics.areEqual((Object) ((ClubsResponse) it2.next()).getClubName(), (Object) dataPrimeCmsResponse.getPrimeId())) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (z) {
                        dataPrimeCmsResponse.setSelected(true);
                    }
                }
                list3 = list2;
            } else {
                list3 = CollectionsKt__CollectionsKt.m40441E();
            }
            if (list3 != null) {
                return list3;
            }
        }
        if (list2 == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return list2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.carrefour.fid.android.domain.models.account.UserCards} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.domain.models.account.UserCards getMostRecentAndSecuredLoyaltyCard(@org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.account.UserCards> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "list"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0010:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r10.next()
            r2 = r1
            com.carrefour.fid.android.domain.models.account.UserCards r2 = (com.carrefour.fid.android.domain.models.account.UserCards) r2
            boolean r2 = r2.mo116764l()
            if (r2 == 0) goto L_0x0010
            r0.add(r1)
            goto L_0x0010
        L_0x0027:
            java.util.Iterator r10 = r0.iterator()
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L_0x0033
            r10 = 0
            goto L_0x0078
        L_0x0033:
            java.lang.Object r0 = r10.next()
            boolean r1 = r10.hasNext()
            if (r1 != 0) goto L_0x003f
        L_0x003d:
            r10 = r0
            goto L_0x0078
        L_0x003f:
            r1 = r0
            com.carrefour.fid.android.domain.models.account.UserCards r1 = (com.carrefour.fid.android.domain.models.account.UserCards) r1
            java.lang.String r1 = r1.mo116761i()
            java.lang.Long r1 = kotlin.text.C11621s.toLongOrNull(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0053
            long r4 = r1.longValue()
            goto L_0x0054
        L_0x0053:
            r4 = r2
        L_0x0054:
            java.lang.Object r1 = r10.next()
            r6 = r1
            com.carrefour.fid.android.domain.models.account.UserCards r6 = (com.carrefour.fid.android.domain.models.account.UserCards) r6
            java.lang.String r6 = r6.mo116761i()
            java.lang.Long r6 = kotlin.text.C11621s.toLongOrNull(r6)
            if (r6 == 0) goto L_0x006a
            long r6 = r6.longValue()
            goto L_0x006b
        L_0x006a:
            r6 = r2
        L_0x006b:
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0071
            r0 = r1
            r4 = r6
        L_0x0071:
            boolean r1 = r10.hasNext()
            if (r1 != 0) goto L_0x0054
            goto L_0x003d
        L_0x0078:
            com.carrefour.fid.android.domain.models.account.UserCards r10 = (com.carrefour.fid.android.domain.models.account.UserCards) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.getMostRecentAndSecuredLoyaltyCard(java.util.List):com.carrefour.fid.android.domain.models.account.UserCards");
    }

    @C12579k
    public final String getPassCardNumber(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
        if (str.length() != 16) {
            return str;
        }
        return "103" + str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getTypeCard(@org.jetbrains.annotations.C12579k java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "cardNumber"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            int r1 = r17.length()
            r2 = 9135720000648225001(0x7ec898effe11a0e9, double:5.271267733273445E302)
            r4 = 9135720000643225010(0x7ec898effdc555b2, double:5.2712677294666885E302)
            r6 = -1
            java.lang.String r8 = "91357"
            r9 = 0
            r10 = 2
            r11 = 0
            r12 = 1
            r13 = 19
            if (r1 != r13) goto L_0x003a
            boolean r1 = kotlin.text.C11622t.startsWith$default(r0, r8, r11, r10, r9)
            if (r1 == 0) goto L_0x003a
            long r14 = okhttp3.internal.Util.toLongOrDefault(r0, r6)
            int r1 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r1 > 0) goto L_0x0035
            int r1 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0035
            r1 = r12
            goto L_0x0036
        L_0x0035:
            r1 = r11
        L_0x0036:
            if (r1 == 0) goto L_0x003a
            r1 = r12
            goto L_0x003b
        L_0x003a:
            r1 = r11
        L_0x003b:
            if (r12 != r1) goto L_0x0044
            com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType r0 = com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType.CZAM
            int r0 = r0.getType()
            goto L_0x008d
        L_0x0044:
            int r1 = r17.length()
            if (r1 != r13) goto L_0x0063
            boolean r1 = kotlin.text.C11622t.startsWith$default(r0, r8, r11, r10, r9)
            if (r1 == 0) goto L_0x0063
            long r6 = okhttp3.internal.Util.toLongOrDefault(r0, r6)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x005e
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x005e
            r1 = r12
            goto L_0x005f
        L_0x005e:
            r1 = r11
        L_0x005f:
            if (r1 != 0) goto L_0x0063
            r1 = r12
            goto L_0x0064
        L_0x0063:
            r1 = r11
        L_0x0064:
            if (r12 != r1) goto L_0x006d
            com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType r0 = com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType.FID
            int r0 = r0.getType()
            goto L_0x008d
        L_0x006d:
            java.lang.String r1 = "103"
            boolean r1 = kotlin.text.C11622t.startsWith$default(r0, r1, r11, r10, r9)
            if (r1 != 0) goto L_0x007d
            int r0 = r17.length()
            r1 = 16
            if (r0 != r1) goto L_0x007e
        L_0x007d:
            r11 = r12
        L_0x007e:
            if (r12 != r11) goto L_0x0087
            com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType r0 = com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType.PASS
            int r0 = r0.getType()
            goto L_0x008d
        L_0x0087:
            com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType r0 = com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType.NOTEXIST
            int r0 = r0.getType()
        L_0x008d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.getTypeCard(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006a  */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getTypeCardName(@org.jetbrains.annotations.C12579k java.lang.String r17, boolean r18) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "cardNumber"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            int r1 = r17.length()
            r2 = 9135720000648225001(0x7ec898effe11a0e9, double:5.271267733273445E302)
            r4 = 9135720000643225010(0x7ec898effdc555b2, double:5.2712677294666885E302)
            r6 = -1
            java.lang.String r8 = "91357"
            r9 = 0
            r10 = 2
            r11 = 0
            r12 = 1
            r13 = 19
            if (r1 != r13) goto L_0x003a
            boolean r1 = kotlin.text.C11622t.startsWith$default(r0, r8, r11, r10, r9)
            if (r1 == 0) goto L_0x003a
            long r14 = okhttp3.internal.Util.toLongOrDefault(r0, r6)
            int r1 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r1 > 0) goto L_0x0035
            int r1 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0035
            r1 = r12
            goto L_0x0036
        L_0x0035:
            r1 = r11
        L_0x0036:
            if (r1 == 0) goto L_0x003a
            r1 = r12
            goto L_0x003b
        L_0x003a:
            r1 = r11
        L_0x003b:
            if (r12 != r1) goto L_0x0040
            java.lang.String r0 = "CZAM"
            goto L_0x0087
        L_0x0040:
            int r1 = r17.length()
            if (r1 != r13) goto L_0x005f
            boolean r1 = kotlin.text.C11622t.startsWith$default(r0, r8, r11, r10, r9)
            if (r1 == 0) goto L_0x005f
            long r6 = okhttp3.internal.Util.toLongOrDefault(r0, r6)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x005a
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x005a
            r1 = r12
            goto L_0x005b
        L_0x005a:
            r1 = r11
        L_0x005b:
            if (r1 != 0) goto L_0x005f
            r1 = r12
            goto L_0x0060
        L_0x005f:
            r1 = r11
        L_0x0060:
            if (r12 != r1) goto L_0x006a
            if (r18 == 0) goto L_0x0067
            java.lang.String r0 = "LOYALTY"
            goto L_0x0087
        L_0x0067:
            java.lang.String r0 = "FID"
            goto L_0x0087
        L_0x006a:
            java.lang.String r1 = "103"
            boolean r1 = kotlin.text.C11622t.startsWith$default(r0, r1, r11, r10, r9)
            if (r1 != 0) goto L_0x007a
            int r0 = r17.length()
            r1 = 16
            if (r0 != r1) goto L_0x007b
        L_0x007a:
            r11 = r12
        L_0x007b:
            if (r12 != r11) goto L_0x0085
            if (r18 == 0) goto L_0x0082
            java.lang.String r0 = "PASS_MASTERCARD"
            goto L_0x0087
        L_0x0082:
            java.lang.String r0 = "PASS"
            goto L_0x0087
        L_0x0085:
            java.lang.String r0 = "NOTEXIST"
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.getTypeCardName(java.lang.String, boolean):java.lang.String");
    }

    @C12579k
    public final UserCards initUserCard(@C12579k String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
        String valueOf = String.valueOf(Calendar.getInstance().getTimeInMillis());
        int typeCard = getTypeCard(str);
        if (typeCard == 0) {
            str2 = CardType.PASS.getValue();
        } else if (typeCard != 2) {
            str2 = CardType.FID.getValue();
        } else {
            str2 = CardType.CZAM.getValue();
        }
        return new UserCards(str, valueOf, true, str2, 0);
    }

    public final boolean luhn(@C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, C34935s.f84988a);
        String obj = StringsKt___StringsKt.reversed(str).toString();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i >= obj.length()) {
                break;
            }
            char charAt = obj.charAt(i);
            int i3 = i2 + 1;
            if (i2 % 2 != 0) {
                z2 = false;
            }
            if (z2) {
                sb.append(charAt);
            }
            i++;
            i2 = i3;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterIndexedTo(StringBu…(), predicate).toString()");
        int i4 = 0;
        for (int i5 = 0; i5 < sb2.length(); i5++) {
            i4 += sb2.charAt(i5) - '0';
        }
        StringBuilder sb3 = new StringBuilder();
        int i6 = 0;
        int i7 = 0;
        while (i6 < obj.length()) {
            char charAt2 = obj.charAt(i6);
            int i8 = i7 + 1;
            if (i7 % 2 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb3.append(charAt2);
            }
            i6++;
            i7 = i8;
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "filterIndexedTo(StringBu…(), predicate).toString()");
        ArrayList arrayList = new ArrayList(sb4.length());
        for (int i9 = 0; i9 < sb4.length(); i9++) {
            arrayList.add(Integer.valueOf(luhn$sumDigits((sb4.charAt(i9) - '0') * 2)));
        }
        if ((i4 + CollectionsKt___CollectionsKt.m40714x5(arrayList)) % 10 == 0) {
            return true;
        }
        return false;
    }
}
