package com.carrefour.fid.android.shared.util.environment;

import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.C28444b;
import com.carrefour.fid.android.shared.constant.C28543h;
import com.carrefour.fid.android.shared.constant.C28548i;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.util.environment.a */
public abstract class C28912a {
    @C12579k

    /* renamed from: d */
    public static final C28913a f70830d = new C28913a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f70831e = 0;

    /* renamed from: a */
    public final int f70832a;

    /* renamed from: b */
    public final int f70833b;
    @C12579k

    /* renamed from: c */
    public final C28548i f70834c;

    /* renamed from: com.carrefour.fid.android.shared.util.environment.a$a */
    public static final class C28913a {
        public /* synthetic */ C28913a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C28912a mo84191a(int i) {
            C28916d dVar = C28916d.f70839f;
            if (i == dVar.mo84188a()) {
                return dVar;
            }
            C28915c cVar = C28915c.f70837f;
            if (i == cVar.mo84188a()) {
                return cVar;
            }
            return C28914b.f70835f;
        }

        @C12579k
        /* renamed from: b */
        public final List<C28912a> mo84192b() {
            return CollectionsKt__CollectionsKt.m40448L(C28914b.f70835f, C28915c.f70837f, C28916d.f70839f);
        }

        public C28913a() {
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.util.environment.a$b */
    public static final class C28914b extends C28912a {
        @C12579k

        /* renamed from: f */
        public static final C28914b f70835f = new C28914b();

        /* renamed from: g */
        public static final int f70836g = 0;

        public C28914b() {
            super(0, C28444b.C28462r.environment_default, C28543h.m118438a(), (DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.util.environment.a$c */
    public static final class C28915c extends C28912a {
        @C12579k

        /* renamed from: f */
        public static final C28915c f70837f = new C28915c();

        /* renamed from: g */
        public static final int f70838g = 0;

        public C28915c() {
            super(1, C28444b.C28462r.environment_pre_prod, C28543h.m118439b(), (DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.shared.util.environment.a$d */
    public static final class C28916d extends C28912a {
        @C12579k

        /* renamed from: f */
        public static final C28916d f70839f = new C28916d();

        /* renamed from: g */
        public static final int f70840g = 0;

        public C28916d() {
            super(2, C28444b.C28462r.environment_sint, C28543h.m118440c(), (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C28912a(int i, int i2, C28548i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, iVar);
    }

    /* renamed from: a */
    public final int mo84188a() {
        return this.f70832a;
    }

    /* renamed from: b */
    public final int mo84189b() {
        return this.f70833b;
    }

    @C12579k
    /* renamed from: c */
    public final C28548i mo84190c() {
        return this.f70834c;
    }

    public C28912a(int i, @C0324b1 int i2, C28548i iVar) {
        this.f70832a = i;
        this.f70833b = i2;
        this.f70834c = iVar;
    }
}
