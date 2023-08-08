package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4528:1\n1#2:4529\n1855#3,2:4530\n1855#3,2:4532\n1855#3,2:4534\n1855#3,2:4536\n1855#3,2:4538\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n*L\n156#1:4530,2\n162#1:4532,2\n172#1:4534,2\n178#1:4536,2\n198#1:4538,2\n*E\n"})
public final class Pending {
    @C12579k

    /* renamed from: a */
    public final List<C8615s0> f22694a;

    /* renamed from: b */
    public final int f22695b;

    /* renamed from: c */
    public int f22696c;
    @C12579k

    /* renamed from: d */
    public final List<C8615s0> f22697d;
    @C12579k

    /* renamed from: e */
    public final HashMap<Integer, C8549i0> f22698e;
    @C12579k

    /* renamed from: f */
    public final C11677z f22699f;

    public Pending(@C12579k List<C8615s0> list, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "keyInfos");
        this.f22694a = list;
        this.f22695b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f22697d = new ArrayList();
            HashMap<Integer, C8549i0> hashMap = new HashMap<>();
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C8615s0 s0Var = this.f22694a.get(i3);
                hashMap.put(Integer.valueOf(s0Var.mo16380c()), new C8549i0(i3, i2, s0Var.mo16381d()));
                i2 += s0Var.mo16381d();
            }
            this.f22698e = hashMap;
            this.f22699f = C10864b0.m38748c(new Pending$keyMap$2(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    /* renamed from: a */
    public final int mo15173a() {
        return this.f22696c;
    }

    @C12579k
    /* renamed from: b */
    public final List<C8615s0> mo15174b() {
        return this.f22694a;
    }

    @C12579k
    /* renamed from: c */
    public final HashMap<Object, LinkedHashSet<C8615s0>> mo15175c() {
        return (HashMap) this.f22699f.getValue();
    }

    @C12580l
    /* renamed from: d */
    public final C8615s0 mo15176d(int i, @C12580l Object obj) {
        Object obj2;
        if (obj != null) {
            obj2 = new C8607r0(Integer.valueOf(i), obj);
        } else {
            obj2 = Integer.valueOf(i);
        }
        return (C8615s0) ComposerKt.m29821k0(mo15175c(), obj2);
    }

    /* renamed from: e */
    public final int mo15177e() {
        return this.f22695b;
    }

    @C12579k
    /* renamed from: f */
    public final List<C8615s0> mo15178f() {
        return this.f22697d;
    }

    /* renamed from: g */
    public final int mo15179g(@C12579k C8615s0 s0Var) {
        Intrinsics.checkNotNullParameter(s0Var, "keyInfo");
        C8549i0 i0Var = this.f22698e.get(Integer.valueOf(s0Var.mo16380c()));
        if (i0Var != null) {
            return i0Var.mo16136b();
        }
        return -1;
    }

    /* renamed from: h */
    public final boolean mo15180h(@C12579k C8615s0 s0Var) {
        Intrinsics.checkNotNullParameter(s0Var, "keyInfo");
        return this.f22697d.add(s0Var);
    }

    /* renamed from: i */
    public final void mo15181i(@C12579k C8615s0 s0Var, int i) {
        Intrinsics.checkNotNullParameter(s0Var, "keyInfo");
        this.f22698e.put(Integer.valueOf(s0Var.mo16380c()), new C8549i0(-1, i, 0));
    }

    /* renamed from: j */
    public final void mo15182j(int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i > i2) {
            Collection<C8549i0> values = this.f22698e.values();
            Intrinsics.checkNotNullExpressionValue(values, "groupInfos.values");
            for (C8549i0 i0Var : values) {
                int b = i0Var.mo16136b();
                if (i > b || b >= i + i3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    i0Var.mo16139e((b - i) + i2);
                } else {
                    if (i2 > b || b >= i) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        i0Var.mo16139e(b + i3);
                    }
                }
            }
        } else if (i2 > i) {
            Collection<C8549i0> values2 = this.f22698e.values();
            Intrinsics.checkNotNullExpressionValue(values2, "groupInfos.values");
            for (C8549i0 i0Var2 : values2) {
                int b2 = i0Var2.mo16136b();
                if (i > b2 || b2 >= i + i3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i0Var2.mo16139e((b2 - i) + i2);
                } else {
                    if (i + 1 > b2 || b2 >= i2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        i0Var2.mo16139e(b2 - i3);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo15183k(int i, int i2) {
        boolean z;
        boolean z2;
        if (i > i2) {
            Collection<C8549i0> values = this.f22698e.values();
            Intrinsics.checkNotNullExpressionValue(values, "groupInfos.values");
            for (C8549i0 i0Var : values) {
                int c = i0Var.mo16137c();
                if (c == i) {
                    i0Var.mo16140f(i2);
                } else {
                    if (i2 > c || c >= i) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        i0Var.mo16140f(c + 1);
                    }
                }
            }
        } else if (i2 > i) {
            Collection<C8549i0> values2 = this.f22698e.values();
            Intrinsics.checkNotNullExpressionValue(values2, "groupInfos.values");
            for (C8549i0 i0Var2 : values2) {
                int c2 = i0Var2.mo16137c();
                if (c2 == i) {
                    i0Var2.mo16140f(i2);
                } else {
                    if (i + 1 > c2 || c2 >= i2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        i0Var2.mo16140f(c2 - 1);
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo15184l(int i) {
        this.f22696c = i;
    }

    /* renamed from: m */
    public final int mo15185m(@C12579k C8615s0 s0Var) {
        Intrinsics.checkNotNullParameter(s0Var, "keyInfo");
        C8549i0 i0Var = this.f22698e.get(Integer.valueOf(s0Var.mo16380c()));
        if (i0Var != null) {
            return i0Var.mo16137c();
        }
        return -1;
    }

    /* renamed from: n */
    public final boolean mo15186n(int i, int i2) {
        int b;
        C8549i0 i0Var = this.f22698e.get(Integer.valueOf(i));
        if (i0Var == null) {
            return false;
        }
        int b2 = i0Var.mo16136b();
        int a = i2 - i0Var.mo16135a();
        i0Var.mo16138d(i2);
        if (a == 0) {
            return true;
        }
        Collection<C8549i0> values = this.f22698e.values();
        Intrinsics.checkNotNullExpressionValue(values, "groupInfos.values");
        for (C8549i0 i0Var2 : values) {
            if (i0Var2.mo16136b() >= b2 && !Intrinsics.areEqual((Object) i0Var2, (Object) i0Var) && (b = i0Var2.mo16136b() + a) >= 0) {
                i0Var2.mo16139e(b);
            }
        }
        return true;
    }

    /* renamed from: o */
    public final int mo15187o(@C12579k C8615s0 s0Var) {
        Intrinsics.checkNotNullParameter(s0Var, "keyInfo");
        C8549i0 i0Var = this.f22698e.get(Integer.valueOf(s0Var.mo16380c()));
        if (i0Var != null) {
            return i0Var.mo16135a();
        }
        return s0Var.mo16381d();
    }
}
