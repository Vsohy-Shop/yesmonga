package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.font.C16226o;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.platform.C16378g;
import androidx.compose.p004ui.unit.C16479d;
import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.r */
public final class C16404r {
    @C11395k(message = "Font.ResourceLoader is deprecated, instead use FontFamily.Resolver", replaceWith = @C11587t0(expression = "ParagraphIntrinsics(text, style, spanStyles, placeholders, density, fontFamilyResolver", imports = {}))
    @C12579k
    /* renamed from: a */
    public static final C16401q m73991a(@C12579k String str, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16151c0>> list, @C12579k List<C16156d.C16159b<C16454v>> list2, @C12579k C16479d dVar, @C12579k C16238t.C16240b bVar) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(list, "spanStyles");
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(bVar, "resourceLoader");
        return C16378g.m73928a(str, p0Var, list, list2, dVar, C16226o.m73118a(bVar));
    }

    @C12579k
    /* renamed from: b */
    public static final C16401q m73992b(@C12579k String str, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16151c0>> list, @C12579k List<C16156d.C16159b<C16454v>> list2, @C12579k C16479d dVar, @C12579k C16242u.C16244b bVar) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(list, "spanStyles");
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(bVar, "fontFamilyResolver");
        return C16378g.m73928a(str, p0Var, list, list2, dVar, bVar);
    }

    /* renamed from: c */
    public static /* synthetic */ C16401q m73993c(String str, C16361p0 p0Var, List list, List list2, C16479d dVar, C16238t.C16240b bVar, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        return m73991a(str, p0Var, list3, list2, dVar, bVar);
    }

    /* renamed from: d */
    public static /* synthetic */ C16401q m73994d(String str, C16361p0 p0Var, List list, List list2, C16479d dVar, C16242u.C16244b bVar, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        return m73992b(str, p0Var, list3, list2, dVar, bVar);
    }
}
