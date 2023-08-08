package okio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10904b;
import kotlin.collections.C10992w;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.f0 */
public final class C12471f0 extends C10904b<ByteString> implements RandomAccess {
    @C12579k

    /* renamed from: d */
    public static final C12472a f30406d = new C12472a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: b */
    public final ByteString[] f30407b;
    @C12579k

    /* renamed from: c */
    public final int[] f30408c;

    /* renamed from: okio.f0$a */
    public static final class C12472a {
        public C12472a() {
        }

        /* renamed from: b */
        public static /* synthetic */ void m50537b(C12472a aVar, long j, C12500m mVar, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.mo27199a((i4 & 1) != 0 ? 0 : j, mVar, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: a */
        public final void mo27199a(long j, C12500m mVar, int i, List<? extends ByteString> list, int i2, int i3, List<Integer> list2) {
            boolean z;
            int i4;
            int i5;
            boolean z2;
            int i6;
            int i7;
            C12500m mVar2;
            boolean z3;
            C12500m mVar3 = mVar;
            int i8 = i;
            List<? extends ByteString> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            if (i9 < i10) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((ByteString) list3.get(i11)).size() >= i8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                ByteString byteString = (ByteString) list.get(i2);
                ByteString byteString2 = (ByteString) list3.get(i10 - 1);
                int i12 = -1;
                if (i8 == byteString.size()) {
                    int intValue = list4.get(i9).intValue();
                    int i13 = i9 + 1;
                    i4 = i13;
                    i5 = intValue;
                    byteString = (ByteString) list3.get(i13);
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (byteString.mo27126f0(i8) != byteString2.mo27126f0(i8)) {
                    int i14 = 1;
                    for (int i15 = i4 + 1; i15 < i10; i15++) {
                        if (((ByteString) list3.get(i15 - 1)).mo27126f0(i8) != ((ByteString) list3.get(i15)).mo27126f0(i8)) {
                            i14++;
                        }
                    }
                    long c = j + mo27200c(mVar3) + ((long) 2) + ((long) (i14 * 2));
                    mVar3.mo27246z0(i14);
                    mVar3.mo27246z0(i5);
                    for (int i16 = i4; i16 < i10; i16++) {
                        byte f0 = ((ByteString) list3.get(i16)).mo27126f0(i8);
                        if (i16 == i4 || f0 != ((ByteString) list3.get(i16 - 1)).mo27126f0(i8)) {
                            mVar3.mo27246z0(f0 & 255);
                        }
                    }
                    C12500m mVar4 = new C12500m();
                    while (i4 < i10) {
                        byte f02 = ((ByteString) list3.get(i4)).mo27126f0(i8);
                        int i17 = i4 + 1;
                        int i18 = i17;
                        while (true) {
                            if (i18 >= i10) {
                                i6 = i10;
                                break;
                            } else if (f02 != ((ByteString) list3.get(i18)).mo27126f0(i8)) {
                                i6 = i18;
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (i17 == i6 && i8 + 1 == ((ByteString) list3.get(i4)).size()) {
                            mVar3.mo27246z0(list4.get(i4).intValue());
                            i7 = i6;
                            mVar2 = mVar4;
                        } else {
                            mVar3.mo27246z0(((int) (c + mo27200c(mVar4))) * i12);
                            i7 = i6;
                            mVar2 = mVar4;
                            mo27199a(c, mVar4, i8 + 1, list, i4, i6, list2);
                        }
                        mVar4 = mVar2;
                        i4 = i7;
                        i12 = -1;
                    }
                    mVar3.mo27245x1(mVar4);
                    return;
                }
                int min = Math.min(byteString.size(), byteString2.size());
                int i19 = i8;
                int i20 = 0;
                while (i19 < min && byteString.mo27126f0(i19) == byteString2.mo27126f0(i19)) {
                    i20++;
                    i19++;
                }
                long c2 = j + mo27200c(mVar3) + ((long) 2) + ((long) i20) + 1;
                mVar3.mo27246z0(-i20);
                mVar3.mo27246z0(i5);
                int i21 = i8 + i20;
                while (i8 < i21) {
                    mVar3.mo27246z0(byteString.mo27126f0(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i21 == ((ByteString) list3.get(i4)).size()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        mVar3.mo27246z0(list4.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C12500m mVar5 = new C12500m();
                mVar3.mo27246z0(((int) (mo27200c(mVar5) + c2)) * -1);
                mo27199a(c2, mVar5, i21, list, i4, i3, list2);
                mVar3.mo27245x1(mVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: c */
        public final long mo27200c(C12500m mVar) {
            return mVar.mo27362c0() / ((long) 4);
        }

        @C12579k
        @C11384m
        /* renamed from: d */
        public final C12471f0 mo27201d(@C12579k ByteString... byteStringArr) {
            boolean z;
            boolean z2;
            boolean z3;
            ByteString[] byteStringArr2 = byteStringArr;
            Intrinsics.checkNotNullParameter(byteStringArr2, "byteStrings");
            int i = 0;
            if (byteStringArr2.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C12471f0(new ByteString[0], new int[]{0, -1}, (DefaultConstructorMarker) null);
            }
            List uz = ArraysKt___ArraysKt.m40265uz(byteStringArr);
            C10992w.m42335j0(uz);
            ArrayList arrayList = new ArrayList(byteStringArr2.length);
            for (ByteString byteString : byteStringArr2) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                List P = CollectionsKt__CollectionsKt.m40452P((Integer[]) Arrays.copyOf(numArr, numArr.length));
                int length = byteStringArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    P.set(CollectionsKt__CollectionsKt.m40469x(uz, byteStringArr2[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                    i2++;
                    i3++;
                }
                if (((ByteString) uz.get(0)).size() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int i4 = 0;
                    while (i4 < uz.size()) {
                        ByteString byteString2 = (ByteString) uz.get(i4);
                        int i5 = i4 + 1;
                        int i6 = i5;
                        while (i6 < uz.size()) {
                            ByteString byteString3 = (ByteString) uz.get(i6);
                            if (!byteString3.mo27129i2(byteString2)) {
                                continue;
                                break;
                            }
                            if (byteString3.size() != byteString2.size()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                            } else if (((Number) P.get(i6)).intValue() > ((Number) P.get(i4)).intValue()) {
                                uz.remove(i6);
                                P.remove(i6);
                            } else {
                                i6++;
                            }
                        }
                        i4 = i5;
                    }
                    C12500m mVar = new C12500m();
                    m50537b(this, 0, mVar, 0, uz, 0, 0, P, 53, (Object) null);
                    int[] iArr = new int[((int) mo27200c(mVar))];
                    while (!mVar.mo27275J2()) {
                        iArr[i] = mVar.readInt();
                        i++;
                    }
                    Object[] copyOf = Arrays.copyOf(byteStringArr2, byteStringArr2.length);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                    return new C12471f0((ByteString[]) copyOf, iArr, (DefaultConstructorMarker) null);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public /* synthetic */ C12472a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C12471f0(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    @C12579k
    @C11384m
    /* renamed from: H */
    public static final C12471f0 m50529H(@C12579k ByteString... byteStringArr) {
        return f30406d.mo27201d(byteStringArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return mo27193h((ByteString) obj);
        }
        return false;
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f30407b.length;
    }

    /* renamed from: h */
    public /* bridge */ boolean mo27193h(ByteString byteString) {
        return super.contains(byteString);
    }

    @C12579k
    /* renamed from: i */
    public ByteString get(int i) {
        return this.f30407b[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return mo27197w((ByteString) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return mo27198y((ByteString) obj);
        }
        return -1;
    }

    @C12579k
    /* renamed from: q */
    public final ByteString[] mo27195q() {
        return this.f30407b;
    }

    @C12579k
    /* renamed from: r */
    public final int[] mo27196r() {
        return this.f30408c;
    }

    /* renamed from: w */
    public /* bridge */ int mo27197w(ByteString byteString) {
        return super.indexOf(byteString);
    }

    /* renamed from: y */
    public /* bridge */ int mo27198y(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    public C12471f0(ByteString[] byteStringArr, int[] iArr) {
        this.f30407b = byteStringArr;
        this.f30408c = iArr;
    }
}
