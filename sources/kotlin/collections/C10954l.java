package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C10857a2;
import kotlin.C11078d1;
import kotlin.C11404m1;
import kotlin.C11431q1;
import kotlin.C11532s0;
import kotlin.C11662u1;
import kotlin.C11665v0;
import kotlin.Pair;
import kotlin.collections.unsigned.UArraysKt___UArraysKt;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* renamed from: kotlin.collections.l */
public class C10954l extends C10952k {
    @C11314h(name = "contentDeepEquals")
    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: g */
    public static final <T> boolean m41005g(@C12580l T[] tArr, @C12580l T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            T t = tArr[i];
            T t2 = tArr2[i];
            if (t != t2) {
                if (t == null || t2 == null) {
                    return false;
                }
                if (!(t instanceof Object[]) || !(t2 instanceof Object[])) {
                    if (!(t instanceof byte[]) || !(t2 instanceof byte[])) {
                        if (!(t instanceof short[]) || !(t2 instanceof short[])) {
                            if (!(t instanceof int[]) || !(t2 instanceof int[])) {
                                if (!(t instanceof long[]) || !(t2 instanceof long[])) {
                                    if (!(t instanceof float[]) || !(t2 instanceof float[])) {
                                        if (!(t instanceof double[]) || !(t2 instanceof double[])) {
                                            if (!(t instanceof char[]) || !(t2 instanceof char[])) {
                                                if (!(t instanceof boolean[]) || !(t2 instanceof boolean[])) {
                                                    if (!(t instanceof C11404m1) || !(t2 instanceof C11404m1)) {
                                                        if (!(t instanceof C10857a2) || !(t2 instanceof C10857a2)) {
                                                            if (!(t instanceof C11431q1) || !(t2 instanceof C11431q1)) {
                                                                if (!(t instanceof C11662u1) || !(t2 instanceof C11662u1)) {
                                                                    if (!Intrinsics.areEqual((Object) t, (Object) t2)) {
                                                                        return false;
                                                                    }
                                                                } else if (!UArraysKt___UArraysKt.m41852X0(((C11662u1) t).mo23521m0(), ((C11662u1) t2).mo23521m0())) {
                                                                    return false;
                                                                }
                                                            } else if (!UArraysKt___UArraysKt.m41798T0(((C11431q1) t).mo22952m0(), ((C11431q1) t2).mo22952m0())) {
                                                                return false;
                                                            }
                                                        } else if (!UArraysKt___UArraysKt.m41785S0(((C10857a2) t).mo21890m0(), ((C10857a2) t2).mo21890m0())) {
                                                            return false;
                                                        }
                                                    } else if (!UArraysKt___UArraysKt.m41824V0(((C11404m1) t).mo22913m0(), ((C11404m1) t2).mo22913m0())) {
                                                        return false;
                                                    }
                                                } else if (!Arrays.equals((boolean[]) t, (boolean[]) t2)) {
                                                    return false;
                                                }
                                            } else if (!Arrays.equals((char[]) t, (char[]) t2)) {
                                                return false;
                                            }
                                        } else if (!Arrays.equals((double[]) t, (double[]) t2)) {
                                            return false;
                                        }
                                    } else if (!Arrays.equals((float[]) t, (float[]) t2)) {
                                        return false;
                                    }
                                } else if (!Arrays.equals((long[]) t, (long[]) t2)) {
                                    return false;
                                }
                            } else if (!Arrays.equals((int[]) t, (int[]) t2)) {
                                return false;
                            }
                        } else if (!Arrays.equals((short[]) t, (short[]) t2)) {
                            return false;
                        }
                    } else if (!Arrays.equals((byte[]) t, (byte[]) t2)) {
                        return false;
                    }
                } else if (!m41005g((Object[]) t, (Object[]) t2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @C11314h(name = "contentDeepToString")
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: h */
    public static final <T> String m41006h(@C12580l T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((C11479u.m44313B(tArr.length, 429496729) * 5) + 2);
        m41007i(tArr, sb, new ArrayList());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: i */
    public static final <T> void m41007i(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append(C12361b.f30260k);
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            T t = tArr[i];
            if (t == null) {
                sb.append("null");
            } else if (t instanceof Object[]) {
                m41007i((Object[]) t, sb, list);
            } else if (t instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
                sb.append(arrays);
            } else if (t instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays2, "toString(this)");
                sb.append(arrays2);
            } else if (t instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays3, "toString(this)");
                sb.append(arrays3);
            } else if (t instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays4, "toString(this)");
                sb.append(arrays4);
            } else if (t instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays5, "toString(this)");
                sb.append(arrays5);
            } else if (t instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays6, "toString(this)");
                sb.append(arrays6);
            } else if (t instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays7, "toString(this)");
                sb.append(arrays7);
            } else if (t instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) t);
                Intrinsics.checkNotNullExpressionValue(arrays8, "toString(this)");
                sb.append(arrays8);
            } else if (t instanceof C11404m1) {
                sb.append(UArraysKt___UArraysKt.m42020j1(((C11404m1) t).mo22913m0()));
            } else if (t instanceof C10857a2) {
                sb.append(UArraysKt___UArraysKt.m42076n1(((C10857a2) t).mo21890m0()));
            } else if (t instanceof C11431q1) {
                sb.append(UArraysKt___UArraysKt.m42062m1(((C11431q1) t).mo22952m0()));
            } else if (t instanceof C11662u1) {
                sb.append(UArraysKt___UArraysKt.m42104p1(((C11662u1) t).mo23521m0()));
            } else {
                sb.append(t.toString());
            }
        }
        sb.append(C12361b.f30261l);
        list.remove(CollectionsKt__CollectionsKt.m40443G(list));
    }

    @C12579k
    /* renamed from: j */
    public static final <T> List<T> m41008j(@C12579k T[][] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i = 0;
        for (T[] length : tArr) {
            i += length.length;
        }
        ArrayList arrayList = new ArrayList(i);
        for (T[] p0 : tArr) {
            C10994x.m42362p0(arrayList, p0);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <C extends java.lang.Object & R, R> R m41009k(C r1, kotlin.jvm.functions.C11289a<? extends R> r2) {
        /*
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1.length
            if (r0 != 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 == 0) goto L_0x0011
            java.lang.Object r1 = r2.invoke()
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C10954l.m41009k(java.lang.Object[], kotlin.jvm.functions.a):java.lang.Object");
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: l */
    public static final boolean m41010l(Object[] objArr) {
        if (objArr == null) {
            return true;
        }
        return objArr.length == 0;
    }

    @C12579k
    /* renamed from: m */
    public static final <T, R> Pair<List<T>, List<R>> m41011m(@C12579k Pair<? extends T, ? extends R>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.mo21849e());
            arrayList2.add(pair.mo21851f());
        }
        return C11078d1.m42659a(arrayList, arrayList2);
    }
}
