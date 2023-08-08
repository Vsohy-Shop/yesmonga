package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.font.C16254z;
import androidx.compose.p004ui.text.platform.C16399y;
import androidx.compose.p004ui.text.platform.C16400z;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.f */
public final class C16164f implements C16238t.C16240b {
    @C12579k

    /* renamed from: b */
    public static final C16165a f40194b = new C16165a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static Map<C16242u.C16244b, C16238t.C16240b> f40195c = new LinkedHashMap();
    @C12579k

    /* renamed from: d */
    public static final C16400z f40196d = C16399y.m73981a();
    @C12579k

    /* renamed from: a */
    public final C16242u.C16244b f40197a;

    @C11363r0({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,603:1\n24#2:604\n1#3:605\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n*L\n290#1:604\n*E\n"})
    /* renamed from: androidx.compose.ui.text.f$a */
    public static final class C16165a {
        public /* synthetic */ C16165a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C16238t.C16240b mo46747a(@C12579k C16242u.C16244b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "fontFamilyResolver");
            synchronized (mo46749c()) {
                C16165a aVar = C16164f.f40194b;
                C16238t.C16240b bVar2 = aVar.mo46748b().get(bVar);
                if (bVar2 != null) {
                    return bVar2;
                }
                C16164f fVar = new C16164f(bVar, (DefaultConstructorMarker) null);
                aVar.mo46748b().put(bVar, fVar);
                return fVar;
            }
        }

        @C12579k
        /* renamed from: b */
        public final Map<C16242u.C16244b, C16238t.C16240b> mo46748b() {
            return C16164f.f40195c;
        }

        @C12579k
        /* renamed from: c */
        public final C16400z mo46749c() {
            return C16164f.f40196d;
        }

        /* renamed from: d */
        public final void mo46750d(@C12579k Map<C16242u.C16244b, C16238t.C16240b> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            C16164f.f40195c = map;
        }

        public C16165a() {
        }
    }

    public /* synthetic */ C16164f(C16242u.C16244b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @C11395k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @C11587t0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @C12579k
    /* renamed from: a */
    public Object mo45979a(@C12579k C16238t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "font");
        return C16242u.C16244b.m73173c(this.f40197a, C16254z.m73205g(tVar), tVar.getWeight(), tVar.mo46930b(), 0, 8, (Object) null).getValue();
    }

    public C16164f(C16242u.C16244b bVar) {
        this.f40197a = bVar;
    }
}
