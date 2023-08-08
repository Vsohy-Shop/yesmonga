package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.node.C15681e;
import androidx.compose.p004ui.node.C15739v0;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.collection.C8423g;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C11363r0({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,201:1\n1182#2:202\n1161#2,2:203\n1182#2:217\n1161#2,2:218\n1#3:205\n460#4,7:206\n48#4:227\n467#4,4:243\n460#4,11:247\n460#4,11:258\n87#5:213\n340#6:214\n206#6,2:215\n208#6,7:220\n215#6,15:228\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n53#1:202\n53#1:203,2\n85#1:217\n85#1:218,2\n84#1:206,7\n85#1:227\n84#1:243,4\n113#1:247,11\n138#1:258,11\n85#1:213\n85#1:214\n85#1:215,2\n85#1:220,7\n85#1:228,15\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusRequester */
public final class FocusRequester {
    @C12579k

    /* renamed from: b */
    public static final C15047a f37201b = new C15047a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37202c = 0;
    @C12579k

    /* renamed from: d */
    public static final FocusRequester f37203d = new FocusRequester();
    @C12579k

    /* renamed from: e */
    public static final FocusRequester f37204e = new FocusRequester();
    @C12579k

    /* renamed from: a */
    public final C8423g<C15084w> f37205a = new C8423g<>(new C15084w[16], 0);

    /* renamed from: androidx.compose.ui.focus.FocusRequester$a */
    public static final class C15047a {

        @C8761g
        @C8567o(parameters = 0)
        /* renamed from: androidx.compose.ui.focus.FocusRequester$a$a */
        public static final class C15048a {
            @C12579k

            /* renamed from: a */
            public static final C15048a f37206a = new C15048a();

            /* renamed from: b */
            public static final int f37207b = 0;

            @C12579k
            /* renamed from: a */
            public final FocusRequester mo42133a() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: b */
            public final FocusRequester mo42134b() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: c */
            public final FocusRequester mo42135c() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: d */
            public final FocusRequester mo42136d() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: e */
            public final FocusRequester mo42137e() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: f */
            public final FocusRequester mo42138f() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: g */
            public final FocusRequester mo42139g() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: h */
            public final FocusRequester mo42140h() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: i */
            public final FocusRequester mo42141i() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: j */
            public final FocusRequester mo42142j() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: k */
            public final FocusRequester mo42143k() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: l */
            public final FocusRequester mo42144l() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: m */
            public final FocusRequester mo42145m() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: n */
            public final FocusRequester mo42146n() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: o */
            public final FocusRequester mo42147o() {
                return new FocusRequester();
            }

            @C12579k
            /* renamed from: p */
            public final FocusRequester mo42148p() {
                return new FocusRequester();
            }
        }

        public /* synthetic */ C15047a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8761g
        /* renamed from: c */
        public static /* synthetic */ void m64582c() {
        }

        @C8761g
        @C12579k
        /* renamed from: a */
        public final C15048a mo42130a() {
            return C15048a.f37206a;
        }

        @C8761g
        @C12579k
        /* renamed from: b */
        public final FocusRequester mo42131b() {
            return FocusRequester.f37204e;
        }

        @C12579k
        /* renamed from: d */
        public final FocusRequester mo42132d() {
            return FocusRequester.f37203d;
        }

        public C15047a() {
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m64576g() {
    }

    /* renamed from: c */
    public final boolean mo42125c() {
        if (this.f37205a.mo15477m0()) {
            C8423g<C15084w> gVar = this.f37205a;
            int h0 = gVar.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = gVar.mo15462d0();
                int i = 0;
                while (!C15086y.m64815a((C15084w) d0[i])) {
                    i++;
                    if (i >= h0) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException(C15080t.f37245a.toString());
    }

    /* renamed from: d */
    public final boolean mo42126d(@C12579k C11300l<? super FocusTargetModifierNode, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onFound");
        if (!(!Intrinsics.areEqual((Object) this, (Object) f37203d))) {
            throw new IllegalStateException(C15080t.f37246b.toString());
        } else if (!(!Intrinsics.areEqual((Object) this, (Object) f37204e))) {
            throw new IllegalStateException(C15080t.f37246b.toString());
        } else if (this.f37205a.mo15477m0()) {
            C8423g<C15084w> gVar = this.f37205a;
            int h0 = gVar.mo15469h0();
            if (h0 <= 0) {
                return false;
            }
            Object[] d0 = gVar.mo15462d0();
            int i = 0;
            boolean z = false;
            do {
                C15084w wVar = (C15084w) d0[i];
                int b = C15739v0.m70597b(1024);
                if (wVar.mo17252q().mo17236Q()) {
                    C8423g gVar2 = new C8423g(new C8767m.C8772d[16], 0);
                    C8767m.C8772d F = wVar.mo17252q().mo17229F();
                    if (F == null) {
                        C15681e.m70221b(gVar2, wVar.mo17252q());
                    } else {
                        gVar2.mo15463e(F);
                    }
                    while (true) {
                        if (!gVar2.mo15477m0()) {
                            break;
                        }
                        C8767m.C8772d dVar = (C8767m.C8772d) gVar2.mo15437D0(gVar2.mo15469h0() - 1);
                        if ((dVar.mo17228E() & b) == 0) {
                            C15681e.m70221b(gVar2, dVar);
                        } else {
                            while (true) {
                                if (dVar == null) {
                                    continue;
                                    break;
                                } else if ((dVar.mo17232I() & b) == 0) {
                                    dVar = dVar.mo17229F();
                                } else if ((dVar instanceof FocusTargetModifierNode) && lVar.invoke((FocusTargetModifierNode) dVar).booleanValue()) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                    i++;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } while (i < h0);
            return z;
        } else {
            throw new IllegalStateException(C15080t.f37245a.toString());
        }
    }

    /* renamed from: e */
    public final boolean mo42127e() {
        if (this.f37205a.mo15477m0()) {
            C8423g<C15084w> gVar = this.f37205a;
            int h0 = gVar.mo15469h0();
            if (h0 > 0) {
                Object[] d0 = gVar.mo15462d0();
                int i = 0;
                while (!C15086y.m64816b((C15084w) d0[i])) {
                    i++;
                    if (i >= h0) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException(C15080t.f37245a.toString());
    }

    @C12579k
    /* renamed from: f */
    public final C8423g<C15084w> mo42128f() {
        return this.f37205a;
    }

    /* renamed from: h */
    public final void mo42129h() {
        mo42126d(FocusRequester$requestFocus$1.f37208f);
    }
}
