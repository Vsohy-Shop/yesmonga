package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.font.C16209i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n102#1,34:189\n102#1,34:234\n108#1,28:279\n108#1,28:318\n35#2,3:166\n38#2,2:173\n40#2:176\n35#2,3:177\n38#2,2:184\n40#2:187\n35#2,3:223\n38#2,2:230\n40#2:233\n35#2,3:268\n38#2,2:275\n40#2:278\n35#2,3:307\n38#2,2:314\n40#2:317\n35#2,3:346\n38#2,2:353\n40#2:356\n35#2,3:357\n38#2,2:364\n40#2:367\n35#2,3:368\n38#2,2:375\n40#2:378\n33#3,4:169\n38#3:175\n33#3,4:180\n38#3:186\n33#3,4:226\n38#3:232\n33#3,4:271\n38#3:277\n33#3,4:310\n38#3:316\n33#3,4:349\n38#3:355\n33#3,4:360\n38#3:366\n33#3,4:371\n38#3:377\n1#4:188\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:189,34\n71#1:234,34\n80#1:279,28\n87#1:318,28\n49#1:166,3\n49#1:173,2\n49#1:176\n57#1:177,3\n57#1:184,2\n57#1:187\n65#1:223,3\n65#1:230,2\n65#1:233\n71#1:268,3\n71#1:275,2\n71#1:278\n80#1:307,3\n80#1:314,2\n80#1:317\n87#1:346,3\n87#1:353,2\n87#1:356\n135#1:357,3\n135#1:364,2\n135#1:367\n135#1:368,3\n135#1:375,2\n135#1:378\n49#1:169,4\n49#1:175\n57#1:180,4\n57#1:186\n65#1:226,4\n65#1:232\n71#1:271,4\n71#1:277\n80#1:310,4\n80#1:316\n87#1:349,4\n87#1:355\n135#1:360,4\n135#1:366\n135#1:371,4\n135#1:377\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.d0 */
public final class C16187d0 {
    /* renamed from: b */
    public static /* synthetic */ List m72933b(C16187d0 d0Var, List list, C16209i0 i0Var, boolean z, C16209i0 i0Var2, C16209i0 i0Var3, int i, Object obj) {
        C16209i0 i0Var4 = null;
        if ((i & 4) != 0) {
            i0Var2 = null;
        }
        if ((i & 8) != 0) {
            i0Var3 = null;
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        int size = list.size();
        int i2 = 0;
        C16209i0 i0Var5 = null;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C16209i0 weight = ((C16238t) list.get(i2)).getWeight();
            if ((i0Var2 == null || weight.compareTo(i0Var2) >= 0) && (i0Var3 == null || weight.compareTo(i0Var3) <= 0)) {
                if (weight.compareTo(i0Var) >= 0) {
                    if (weight.compareTo(i0Var) <= 0) {
                        i0Var4 = weight;
                        i0Var5 = i0Var4;
                        break;
                    } else if (i0Var5 == null || weight.compareTo(i0Var5) < 0) {
                        i0Var5 = weight;
                    }
                } else if (i0Var4 == null || weight.compareTo(i0Var4) > 0) {
                    i0Var4 = weight;
                }
            }
            i2++;
        }
        if (!z ? i0Var5 != null : i0Var4 == null) {
            i0Var4 = i0Var5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Object obj2 = list.get(i3);
            if (Intrinsics.areEqual((Object) ((C16238t) obj2).getWeight(), (Object) i0Var4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: a */
    public final List<C16238t> mo46873a(@C12579k List<? extends C16238t> list, @C12579k C16209i0 i0Var, boolean z, @C12580l C16209i0 i0Var2, @C12580l C16209i0 i0Var3) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        int size = list.size();
        C16209i0 i0Var4 = null;
        C16209i0 i0Var5 = null;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C16209i0 weight = ((C16238t) list.get(i)).getWeight();
            if ((i0Var2 == null || weight.compareTo(i0Var2) >= 0) && (i0Var3 == null || weight.compareTo(i0Var3) <= 0)) {
                if (weight.compareTo(i0Var) >= 0) {
                    if (weight.compareTo(i0Var) <= 0) {
                        i0Var4 = weight;
                        i0Var5 = i0Var4;
                        break;
                    } else if (i0Var5 == null || weight.compareTo(i0Var5) < 0) {
                        i0Var5 = weight;
                    }
                } else if (i0Var4 == null || weight.compareTo(i0Var4) > 0) {
                    i0Var4 = weight;
                }
            }
            i++;
        }
        if (!z ? i0Var5 != null : i0Var4 == null) {
            i0Var4 = i0Var5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj = list.get(i2);
            if (Intrinsics.areEqual((Object) ((C16238t) obj).getWeight(), (Object) i0Var4)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: c */
    public final List<C16238t> mo46874c(@C12579k C16242u uVar, @C12579k C16209i0 i0Var, int i) {
        Intrinsics.checkNotNullParameter(uVar, "fontFamily");
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        if (uVar instanceof C16176a0) {
            return mo46875d((C16176a0) uVar, i0Var, i);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    @C12579k
    /* renamed from: d */
    public final List<C16238t> mo46875d(@C12579k C16176a0 a0Var, @C12579k C16209i0 i0Var, int i) {
        Intrinsics.checkNotNullParameter(a0Var, "fontFamily");
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        return mo46876e(a0Var.mo46822X(), i0Var, i);
    }

    @C12579k
    /* renamed from: e */
    public final List<C16238t> mo46876e(@C12579k List<? extends C16238t> list, @C12579k C16209i0 i0Var, int i) {
        Intrinsics.checkNotNullParameter(list, "fontList");
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                break;
            }
            Object obj = list.get(i3);
            C16238t tVar = (C16238t) obj;
            if (!Intrinsics.areEqual((Object) tVar.getWeight(), (Object) i0Var) || !C16190e0.m72951f(tVar.mo46930b(), i)) {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
            i3++;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj2 = list.get(i4);
            if (C16190e0.m72951f(((C16238t) obj2).mo46930b(), i)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List list2 = list;
        C16209i0.C16210a aVar = C16209i0.f40292b;
        C16209i0 i0Var2 = null;
        if (i0Var.compareTo(aVar.mo46959z()) < 0) {
            int size3 = list2.size();
            C16209i0 i0Var3 = null;
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    break;
                }
                C16209i0 weight = ((C16238t) list2.get(i5)).getWeight();
                if (weight.compareTo(i0Var) >= 0) {
                    if (weight.compareTo(i0Var) <= 0) {
                        i0Var3 = weight;
                        i0Var2 = i0Var3;
                        break;
                    } else if (i0Var3 == null || weight.compareTo(i0Var3) < 0) {
                        i0Var3 = weight;
                    }
                } else if (i0Var2 == null || weight.compareTo(i0Var2) > 0) {
                    i0Var2 = weight;
                }
                i5++;
            }
            if (i0Var2 != null) {
                i0Var3 = i0Var2;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list2.size();
            while (i2 < size4) {
                Object obj3 = list2.get(i2);
                if (Intrinsics.areEqual((Object) ((C16238t) obj3).getWeight(), (Object) i0Var3)) {
                    arrayList3.add(obj3);
                }
                i2++;
            }
            return arrayList3;
        } else if (i0Var.compareTo(aVar.mo46941B()) > 0) {
            int size5 = list2.size();
            C16209i0 i0Var4 = null;
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    break;
                }
                C16209i0 weight2 = ((C16238t) list2.get(i6)).getWeight();
                if (weight2.compareTo(i0Var) >= 0) {
                    if (weight2.compareTo(i0Var) <= 0) {
                        i0Var4 = weight2;
                        i0Var2 = i0Var4;
                        break;
                    } else if (i0Var4 == null || weight2.compareTo(i0Var4) < 0) {
                        i0Var4 = weight2;
                    }
                } else if (i0Var2 == null || weight2.compareTo(i0Var2) > 0) {
                    i0Var2 = weight2;
                }
                i6++;
            }
            if (i0Var4 == null) {
                i0Var4 = i0Var2;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list2.size();
            while (i2 < size6) {
                Object obj4 = list2.get(i2);
                if (Intrinsics.areEqual((Object) ((C16238t) obj4).getWeight(), (Object) i0Var4)) {
                    arrayList4.add(obj4);
                }
                i2++;
            }
            return arrayList4;
        } else {
            C16209i0 B = aVar.mo46941B();
            int size7 = list2.size();
            C16209i0 i0Var5 = null;
            C16209i0 i0Var6 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size7) {
                    break;
                }
                C16209i0 weight3 = ((C16238t) list2.get(i7)).getWeight();
                if (B == null || weight3.compareTo(B) <= 0) {
                    if (weight3.compareTo(i0Var) >= 0) {
                        if (weight3.compareTo(i0Var) <= 0) {
                            i0Var5 = weight3;
                            i0Var6 = i0Var5;
                            break;
                        } else if (i0Var6 == null || weight3.compareTo(i0Var6) < 0) {
                            i0Var6 = weight3;
                        }
                    } else if (i0Var5 == null || weight3.compareTo(i0Var5) > 0) {
                        i0Var5 = weight3;
                    }
                }
                i7++;
            }
            if (i0Var6 != null) {
                i0Var5 = i0Var6;
            }
            ArrayList arrayList5 = new ArrayList(list2.size());
            int size8 = list2.size();
            for (int i8 = 0; i8 < size8; i8++) {
                Object obj5 = list2.get(i8);
                if (Intrinsics.areEqual((Object) ((C16238t) obj5).getWeight(), (Object) i0Var5)) {
                    arrayList5.add(obj5);
                }
            }
            if (!arrayList5.isEmpty()) {
                return arrayList5;
            }
            C16209i0 B2 = C16209i0.f40292b.mo46941B();
            int size9 = list2.size();
            C16209i0 i0Var7 = null;
            int i9 = 0;
            while (true) {
                if (i9 >= size9) {
                    break;
                }
                C16209i0 weight4 = ((C16238t) list2.get(i9)).getWeight();
                if (B2 == null || weight4.compareTo(B2) >= 0) {
                    if (weight4.compareTo(i0Var) >= 0) {
                        if (weight4.compareTo(i0Var) <= 0) {
                            i0Var2 = weight4;
                            i0Var7 = i0Var2;
                            break;
                        } else if (i0Var7 == null || weight4.compareTo(i0Var7) < 0) {
                            i0Var7 = weight4;
                        }
                    } else if (i0Var2 == null || weight4.compareTo(i0Var2) > 0) {
                        i0Var2 = weight4;
                    }
                }
                i9++;
            }
            if (i0Var7 != null) {
                i0Var2 = i0Var7;
            }
            ArrayList arrayList6 = new ArrayList(list2.size());
            int size10 = list2.size();
            while (i2 < size10) {
                Object obj6 = list2.get(i2);
                if (Intrinsics.areEqual((Object) ((C16238t) obj6).getWeight(), (Object) i0Var2)) {
                    arrayList6.add(obj6);
                }
                i2++;
            }
            return arrayList6;
        }
    }
}
