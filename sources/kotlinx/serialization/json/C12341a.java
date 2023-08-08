package kotlinx.serialization.json;

import androidx.constraintlayout.core.motion.utils.C16717v;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.C12440p;
import kotlinx.serialization.C12445u;
import kotlinx.serialization.json.internal.C12370f0;
import kotlinx.serialization.json.internal.C12375h0;
import kotlinx.serialization.json.internal.C12380j0;
import kotlinx.serialization.json.internal.C12383l;
import kotlinx.serialization.json.internal.C12385l0;
import kotlinx.serialization.json.internal.C12396u;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.C12434e;
import kotlinx.serialization.modules.C12436g;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.a */
public abstract class C12341a implements C12445u {
    @C12579k

    /* renamed from: d */
    public static final C12342a f30174d = new C12342a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final C12354g f30175a;
    @C12579k

    /* renamed from: b */
    public final C12434e f30176b;
    @C12579k

    /* renamed from: c */
    public final C12383l f30177c;

    /* renamed from: kotlinx.serialization.json.a$a */
    public static final class C12342a extends C12341a {
        public /* synthetic */ C12342a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C12342a() {
            super(new C12354g(false, false, false, false, false, false, (String) null, false, false, (String) null, false, false, 4095, (DefaultConstructorMarker) null), C12436g.m50300a(), (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C12341a(C12354g gVar, C12434e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, eVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Should not be accessed directly, use Json.schemaCache accessor instead", replaceWith = @C11587t0(expression = "schemaCache", imports = {}))
    /* renamed from: j */
    public static /* synthetic */ void m49683j() {
    }

    @C12579k
    /* renamed from: a */
    public C12434e mo25277a() {
        return this.f30176b;
    }

    /* renamed from: b */
    public final <T> T mo25278b(@C12579k C12199c<T> cVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        C12380j0 j0Var = new C12380j0(str);
        T G = new C12370f0(this, WriteMode.OBJ, j0Var, cVar.getDescriptor()).mo24870G(cVar);
        j0Var.mo25454v();
        return G;
    }

    @C12579k
    /* renamed from: d */
    public final <T> String mo25279d(@C12579k C12440p<? super T> pVar, T t) {
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        C12396u uVar = new C12396u();
        try {
            new C12375h0(uVar, this, WriteMode.OBJ, new C12409o[WriteMode.values().length]).mo24908e(pVar, t);
            return uVar.toString();
        } finally {
            uVar.mo25543i();
        }
    }

    /* renamed from: f */
    public final <T> T mo25280f(@C12579k C12199c<T> cVar, @C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        Intrinsics.checkNotNullParameter(kVar, "element");
        return C12385l0.m50091a(this, kVar, cVar);
    }

    @C12579k
    /* renamed from: g */
    public final <T> C12403k mo25281g(@C12579k C12440p<? super T> pVar, T t) {
        Intrinsics.checkNotNullParameter(pVar, "serializer");
        return TreeJsonEncoderKt.m49861d(this, t, pVar);
    }

    @C12579k
    /* renamed from: h */
    public final C12354g mo25282h() {
        return this.f30175a;
    }

    @C12579k
    /* renamed from: i */
    public final C12383l mo25283i() {
        return this.f30177c;
    }

    @C12579k
    /* renamed from: k */
    public final C12403k mo25284k(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C16717v.C16719b.f42182e);
        return (C12403k) mo25278b(JsonElementSerializer.f30161a, str);
    }

    public C12341a(C12354g gVar, C12434e eVar) {
        this.f30175a = gVar;
        this.f30176b = eVar;
        this.f30177c = new C12383l();
    }
}
