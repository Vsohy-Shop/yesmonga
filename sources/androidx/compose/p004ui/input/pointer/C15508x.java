package androidx.compose.p004ui.input.pointer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,237:1\n33#2,6:238\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n*L\n147#1:238,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.x */
public final class C15508x {
    @C12579k

    /* renamed from: a */
    public final Map<C15506v, C15509a> f38582a = new LinkedHashMap();

    /* renamed from: androidx.compose.ui.input.pointer.x$a */
    public static final class C15509a {

        /* renamed from: a */
        public final long f38583a;

        /* renamed from: b */
        public final long f38584b;

        /* renamed from: c */
        public final boolean f38585c;

        /* renamed from: d */
        public final int f38586d;

        public /* synthetic */ C15509a(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z, i);
        }

        /* renamed from: a */
        public final boolean mo44189a() {
            return this.f38585c;
        }

        /* renamed from: b */
        public final long mo44190b() {
            return this.f38584b;
        }

        /* renamed from: c */
        public final int mo44191c() {
            return this.f38586d;
        }

        /* renamed from: d */
        public final long mo44192d() {
            return this.f38583a;
        }

        public C15509a(long j, long j2, boolean z, int i) {
            this.f38583a = j;
            this.f38584b = j2;
            this.f38585c = z;
            this.f38586d = i;
        }
    }

    /* renamed from: a */
    public final void mo44187a() {
        this.f38582a.clear();
    }

    @C12579k
    /* renamed from: b */
    public final C15476g mo44188b(@C12579k C15510y yVar, @C12579k C15484j0 j0Var) {
        boolean z;
        long j;
        long j2;
        C15510y yVar2 = yVar;
        C15484j0 j0Var2 = j0Var;
        Intrinsics.checkNotNullParameter(yVar2, "pointerInputEvent");
        Intrinsics.checkNotNullParameter(j0Var2, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(yVar.mo44194b().size());
        List<C15511z> b = yVar.mo44194b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C15511z zVar = b.get(i);
            C15509a aVar = this.f38582a.get(C15506v.m68786a(zVar.mo44211o()));
            if (aVar == null) {
                j2 = zVar.mo44219v();
                j = zVar.mo44213q();
                z = false;
            } else {
                long d = aVar.mo44192d();
                j2 = d;
                z = aVar.mo44189a();
                j = j0Var2.mo44078s(aVar.mo44190b());
            }
            linkedHashMap.put(C15506v.m68786a(zVar.mo44211o()), new C15507w(zVar.mo44211o(), zVar.mo44219v(), zVar.mo44213q(), zVar.mo44209m(), zVar.mo44215s(), j2, j, z, false, zVar.mo44218u(), (List) zVar.mo44210n(), zVar.mo44216t(), (DefaultConstructorMarker) null));
            if (zVar.mo44209m()) {
                Map<C15506v, C15509a> map = this.f38582a;
                C15506v a = C15506v.m68786a(zVar.mo44211o());
                C15509a aVar2 = r11;
                C15509a aVar3 = new C15509a(zVar.mo44219v(), zVar.mo44214r(), zVar.mo44209m(), zVar.mo44218u(), (DefaultConstructorMarker) null);
                map.put(a, aVar2);
            } else {
                this.f38582a.remove(C15506v.m68786a(zVar.mo44211o()));
            }
        }
        return new C15476g(linkedHashMap, yVar2);
    }
}
