package com.carrefour.fid.android.domain.models.service.models;

import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12439o
/* renamed from: com.carrefour.fid.android.domain.models.service.models.b */
public final class C38147b {
    @C12579k
    public static final C38149b Companion = new C38149b((DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: a */
    public final String f96626a;
    @C12580l

    /* renamed from: b */
    public final String f96627b;

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    /* renamed from: com.carrefour.fid.android.domain.models.service.models.b$a */
    public static final class C38148a implements C12327y<C38147b> {
        @C12579k

        /* renamed from: a */
        public static final C38148a f96628a;

        /* renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f96629b;

        static {
            C38148a aVar = new C38148a();
            f96628a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.domain.models.service.models.DayTimeRange", aVar, 2);
            pluginGeneratedSerialDescriptor.mo24966k("beginTime", true);
            pluginGeneratedSerialDescriptor.mo24966k("endTime", true);
            f96629b = pluginGeneratedSerialDescriptor;
        }

        @C12579k
        /* renamed from: a */
        public C38147b deserialize(@C12579k C12241e eVar) {
            Object obj;
            int i;
            Object obj2;
            Intrinsics.checkNotNullParameter(eVar, "decoder");
            C12217f descriptor = getDescriptor();
            C12236c b = eVar.mo24875b(descriptor);
            if (b.mo24886p()) {
                C12310s1 s1Var = C12310s1.f30117a;
                obj = b.mo24885n(descriptor, 0, s1Var, null);
                obj2 = b.mo24885n(descriptor, 1, s1Var, null);
                i = 3;
            } else {
                boolean z = true;
                int i2 = 0;
                obj2 = null;
                Object obj3 = null;
                while (z) {
                    int o = b.mo24931o(descriptor);
                    if (o == -1) {
                        z = false;
                    } else if (o == 0) {
                        obj3 = b.mo24885n(descriptor, 0, C12310s1.f30117a, obj3);
                        i2 |= 1;
                    } else if (o == 1) {
                        obj2 = b.mo24885n(descriptor, 1, C12310s1.f30117a, obj2);
                        i2 |= 2;
                    } else {
                        throw new UnknownFieldException(o);
                    }
                }
                i = i2;
                obj = obj3;
            }
            b.mo24876c(descriptor);
            return new C38147b(i, (String) obj, (String) obj2, (C12295n1) null);
        }

        /* renamed from: b */
        public void serialize(@C12579k C12244g gVar, @C12579k C38147b bVar) {
            Intrinsics.checkNotNullParameter(gVar, "encoder");
            Intrinsics.checkNotNullParameter(bVar, "value");
            C12217f descriptor = getDescriptor();
            C12239d b = gVar.mo24906b(descriptor);
            C38147b.m158080g(bVar, b, descriptor);
            b.mo24907c(descriptor);
        }

        @C12579k
        public C12248g<?>[] childSerializers() {
            C12310s1 s1Var = C12310s1.f30117a;
            return new C12248g[]{C12197a.m48817q(s1Var), C12197a.m48817q(s1Var)};
        }

        @C12579k
        public C12217f getDescriptor() {
            return f96629b;
        }

        @C12579k
        public C12248g<?>[] typeParametersSerializers() {
            return C12327y.C12328a.m49635a(this);
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.service.models.b$b */
    public static final class C38149b {
        public /* synthetic */ C38149b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<C38147b> serializer() {
            return C38148a.f96628a;
        }

        public C38149b() {
        }
    }

    public C38147b() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C38147b m158079d(C38147b bVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f96626a;
        }
        if ((i & 2) != 0) {
            str2 = bVar.f96627b;
        }
        return bVar.mo119253c(str, str2);
    }

    @C11384m
    /* renamed from: g */
    public static final /* synthetic */ void m158080g(C38147b bVar, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bVar.f96626a != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bVar.f96626a);
        }
        if (dVar.mo24897A(fVar, 1) || bVar.f96627b != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bVar.f96627b);
        }
    }

    @C12580l
    /* renamed from: a */
    public final String mo119251a() {
        return this.f96626a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo119252b() {
        return this.f96627b;
    }

    @C12579k
    /* renamed from: c */
    public final C38147b mo119253c(@C12580l String str, @C12580l String str2) {
        return new C38147b(str, str2);
    }

    @C12580l
    /* renamed from: e */
    public final String mo119254e() {
        return this.f96626a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38147b)) {
            return false;
        }
        C38147b bVar = (C38147b) obj;
        return Intrinsics.areEqual((Object) this.f96626a, (Object) bVar.f96626a) && Intrinsics.areEqual((Object) this.f96627b, (Object) bVar.f96627b);
    }

    @C12580l
    /* renamed from: f */
    public final String mo119256f() {
        return this.f96627b;
    }

    public int hashCode() {
        String str = this.f96626a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f96627b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.f96626a;
        String str2 = this.f96627b;
        return "DayTimeRange(beginTime=" + str + ", endTime=" + str2 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ C38147b(int i, String str, String str2, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, C38148a.f96628a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.f96626a = null;
        } else {
            this.f96626a = str;
        }
        if ((i & 2) == 0) {
            this.f96627b = null;
        } else {
            this.f96627b = str2;
        }
    }

    public C38147b(@C12580l String str, @C12580l String str2) {
        this.f96626a = str;
        this.f96627b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38147b(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
