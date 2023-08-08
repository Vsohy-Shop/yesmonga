package kotlin.time;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.C11665v0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C11654r;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nmeasureTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,121:1\n50#1,7:122\n113#1,7:129\n*S KotlinDebug\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n21#1:122,7\n83#1:129,7\n*E\n"})
/* renamed from: kotlin.time.m */
public final class C11648m {
    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: a */
    public static final long m45670a(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        long b = C11654r.C11656b.f28970b.mo23495b();
        aVar.invoke();
        return C11654r.C11656b.C11657a.m45700M(b);
    }

    @C11646k
    @C11665v0(version = "1.7")
    /* renamed from: b */
    public static final long m45671b(@C12579k C11654r.C11656b bVar, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        long b = bVar.mo23495b();
        aVar.invoke();
        return C11654r.C11656b.C11657a.m45700M(b);
    }

    @C11646k
    @C11665v0(version = "1.3")
    /* renamed from: c */
    public static final long m45672c(@C12579k C11654r rVar, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        C11652q a = rVar.mo23410a();
        aVar.invoke();
        return a.mo23418g();
    }

    @C11646k
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: d */
    public static final <T> C11659s<T> m45673d(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        return new C11659s<>(aVar.invoke(), C11654r.C11656b.C11657a.m45700M(C11654r.C11656b.f28970b.mo23495b()), (DefaultConstructorMarker) null);
    }

    @C11646k
    @C11665v0(version = "1.7")
    @C12579k
    /* renamed from: e */
    public static final <T> C11659s<T> m45674e(@C12579k C11654r.C11656b bVar, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        return new C11659s<>(aVar.invoke(), C11654r.C11656b.C11657a.m45700M(bVar.mo23495b()), (DefaultConstructorMarker) null);
    }

    @C11646k
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: f */
    public static final <T> C11659s<T> m45675f(@C12579k C11654r rVar, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        return new C11659s<>(aVar.invoke(), rVar.mo23410a().mo23418g(), (DefaultConstructorMarker) null);
    }
}
