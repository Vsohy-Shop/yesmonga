package androidx.compose.p004ui.text.platform;

import androidx.compose.p004ui.text.AndroidParagraph;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16355n;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.C16401q;
import androidx.compose.p004ui.text.C16406s;
import androidx.compose.p004ui.text.C16454v;
import androidx.compose.p004ui.text.font.C16226o;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "AndroidParagraph_androidKt")
/* renamed from: androidx.compose.ui.text.platform.h */
public final class C16379h {
    @C11395k(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @C11587t0(expression = "ActualParagraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @C12579k
    /* renamed from: a */
    public static final C16355n m73933a(@C12579k String str, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16151c0>> list, @C12579k List<C16156d.C16159b<C16454v>> list2, int i, boolean z, float f, @C12579k C16479d dVar, @C12579k C16238t.C16240b bVar) {
        Intrinsics.checkNotNullParameter(str, "text");
        C16361p0 p0Var2 = p0Var;
        Intrinsics.checkNotNullParameter(p0Var2, "style");
        List<C16156d.C16159b<C16151c0>> list3 = list;
        Intrinsics.checkNotNullParameter(list3, "spanStyles");
        List<C16156d.C16159b<C16454v>> list4 = list2;
        Intrinsics.checkNotNullParameter(list4, "placeholders");
        C16479d dVar2 = dVar;
        Intrinsics.checkNotNullParameter(dVar2, "density");
        Intrinsics.checkNotNullParameter(bVar, "resourceLoader");
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, p0Var2, list3, list4, C16226o.m73118a(bVar), dVar2), i, z, C16478c.m74377b(0, C16406s.m74005k(f), 0, 0, 13, (Object) null), (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: b */
    public static final C16355n m73934b(@C12579k C16401q qVar, int i, boolean z, long j) {
        Intrinsics.checkNotNullParameter(qVar, "paragraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) qVar, i, z, j, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: c */
    public static final C16355n m73935c(@C12579k String str, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16151c0>> list, @C12579k List<C16156d.C16159b<C16454v>> list2, int i, boolean z, long j, @C12579k C16479d dVar, @C12579k C16242u.C16244b bVar) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(list, "spanStyles");
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        C16479d dVar2 = dVar;
        Intrinsics.checkNotNullParameter(dVar2, "density");
        C16242u.C16244b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar2, "fontFamilyResolver");
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, p0Var, list, list2, bVar2, dVar2), i, z, j, (DefaultConstructorMarker) null);
    }
}
