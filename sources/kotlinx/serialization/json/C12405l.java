package kotlinx.serialization.json;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.l */
public final class C12405l {
    @C12579k

    /* renamed from: a */
    public static final String f30344a = "Infix 'to' operator is deprecated for removal for the favour of 'add'";
    @C12579k

    /* renamed from: b */
    public static final String f30345b = "Unary plus is deprecated for removal for the favour of 'add'";

    /* renamed from: a */
    public static final boolean m50154a(@C12579k C12348c cVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.mo25325a(C12406m.m50166a(bool));
    }

    /* renamed from: b */
    public static final boolean m50155b(@C12579k C12348c cVar, @C12580l Number number) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.mo25325a(C12406m.m50167b(number));
    }

    /* renamed from: c */
    public static final boolean m50156c(@C12579k C12348c cVar, @C12580l String str) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.mo25325a(C12406m.m50168c(str));
    }

    /* renamed from: d */
    public static final boolean m50157d(@C12579k C12348c cVar, @C12579k C11300l<? super C12348c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        C12348c cVar2 = new C12348c();
        lVar.invoke(cVar2);
        return cVar.mo25325a(cVar2.mo25326b());
    }

    /* renamed from: e */
    public static final boolean m50158e(@C12579k C12348c cVar, @C12579k C11300l<? super C12418v, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        C12418v vVar = new C12418v();
        lVar.invoke(vVar);
        return cVar.mo25325a(vVar.mo25560a());
    }

    @C12579k
    /* renamed from: f */
    public static final C12344b m50159f(@C12579k C11300l<? super C12348c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        C12348c cVar = new C12348c();
        lVar.invoke(cVar);
        return cVar.mo25326b();
    }

    @C12579k
    /* renamed from: g */
    public static final JsonObject m50160g(@C12579k C11300l<? super C12418v, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        C12418v vVar = new C12418v();
        lVar.invoke(vVar);
        return vVar.mo25560a();
    }

    @C12580l
    /* renamed from: h */
    public static final C12403k m50161h(@C12579k C12418v vVar, @C12579k String str, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        return vVar.mo25561b(str, C12406m.m50166a(bool));
    }

    @C12580l
    /* renamed from: i */
    public static final C12403k m50162i(@C12579k C12418v vVar, @C12579k String str, @C12580l Number number) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        return vVar.mo25561b(str, C12406m.m50167b(number));
    }

    @C12580l
    /* renamed from: j */
    public static final C12403k m50163j(@C12579k C12418v vVar, @C12579k String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        return vVar.mo25561b(str, C12406m.m50168c(str2));
    }

    @C12580l
    /* renamed from: k */
    public static final C12403k m50164k(@C12579k C12418v vVar, @C12579k String str, @C12579k C11300l<? super C12348c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        C12348c cVar = new C12348c();
        lVar.invoke(cVar);
        return vVar.mo25561b(str, cVar.mo25326b());
    }

    @C12580l
    /* renamed from: l */
    public static final C12403k m50165l(@C12579k C12418v vVar, @C12579k String str, @C12579k C11300l<? super C12418v, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        C12418v vVar2 = new C12418v();
        lVar.invoke(vVar2);
        return vVar.mo25561b(str, vVar2.mo25560a());
    }
}
