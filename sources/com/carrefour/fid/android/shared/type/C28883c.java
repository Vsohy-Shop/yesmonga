package com.carrefour.fid.android.shared.type;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.type.C28885d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.type.c */
public final class C28883c {
    @C12579k

    /* renamed from: d */
    public static final C28884a f70758d = new C28884a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f70759e = 0;
    @C12579k

    /* renamed from: f */
    public static final C28883c f70760f;
    @C12579k

    /* renamed from: g */
    public static final C28883c f70761g;
    @C12579k

    /* renamed from: h */
    public static final C28883c f70762h;
    @C12579k

    /* renamed from: a */
    public final C28885d.C28888b f70763a;
    @C12579k

    /* renamed from: b */
    public final C28885d.C28890c f70764b;
    @C12579k

    /* renamed from: c */
    public final C28885d.C28886a f70765c;

    /* renamed from: com.carrefour.fid.android.shared.type.c$a */
    public static final class C28884a {
        public /* synthetic */ C28884a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C28883c mo84067a() {
            return C28883c.f70760f;
        }

        @C12579k
        /* renamed from: b */
        public final C28883c mo84068b() {
            return C28883c.f70762h;
        }

        @C12579k
        /* renamed from: c */
        public final C28883c mo84069c() {
            return C28883c.f70761g;
        }

        public C28884a() {
        }
    }

    static {
        C28885d.C28888b.C28889a aVar = C28885d.C28888b.f70771c;
        C28885d.C28888b a = aVar.mo84074a();
        C28885d.C28890c.C28891a aVar2 = C28885d.C28890c.f70775c;
        C28885d.C28890c a2 = aVar2.mo84077a();
        C28885d.C28886a.C28887a aVar3 = C28885d.C28886a.f70768c;
        f70760f = new C28883c(a, a2, aVar3.mo84071a());
        f70761g = new C28883c(aVar.mo84076c(), aVar2.mo84079c(), aVar3.mo84073c());
        f70762h = new C28883c(aVar.mo84075b(), aVar2.mo84078b(), aVar3.mo84072b());
    }

    public C28883c(@C12579k C28885d.C28888b bVar, @C12579k C28885d.C28890c cVar, @C12579k C28885d.C28886a aVar) {
        Intrinsics.checkNotNullParameter(bVar, "discovery");
        Intrinsics.checkNotNullParameter(cVar, "obtain");
        Intrinsics.checkNotNullParameter(aVar, "basket");
        this.f70763a = bVar;
        this.f70764b = cVar;
        this.f70765c = aVar;
    }

    @C12579k
    /* renamed from: d */
    public final C28885d.C28886a mo84064d() {
        return this.f70765c;
    }

    @C12579k
    /* renamed from: e */
    public final C28885d.C28888b mo84065e() {
        return this.f70763a;
    }

    @C12579k
    /* renamed from: f */
    public final C28885d.C28890c mo84066f() {
        return this.f70764b;
    }
}
