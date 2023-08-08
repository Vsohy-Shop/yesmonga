package androidx.compose.p004ui.text.style;

import androidx.compose.p004ui.graphics.C15127c4;
import androidx.compose.p004ui.graphics.C15225h4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.runtime.internal.C8567o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.style.TextForegroundStyle */
public interface TextForegroundStyle {
    @C12579k

    /* renamed from: a */
    public static final C16408a f40663a = C16408a.f40664a;

    @C11363r0({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,148:1\n646#2:149\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n*L\n77#1:149\n*E\n"})
    /* renamed from: androidx.compose.ui.text.style.TextForegroundStyle$a */
    public static final class C16408a {

        /* renamed from: a */
        public static final /* synthetic */ C16408a f40664a = new C16408a();

        @C12579k
        /* renamed from: a */
        public final TextForegroundStyle mo47582a(@C12580l C15421z1 z1Var, float f) {
            if (z1Var == null) {
                return C16409b.f40665b;
            }
            if (z1Var instanceof C15225h4) {
                return mo47583b(C16438l.m74218c(((C15225h4) z1Var).mo42781c(), f));
            }
            if (z1Var instanceof C15127c4) {
                return new C16413c((C15127c4) z1Var, f);
            }
            throw new NoWhenBranchMatchedException();
        }

        @C12579k
        /* renamed from: b */
        public final TextForegroundStyle mo47583b(long j) {
            boolean z;
            if (j != C15240j2.f37547b.mo42851u()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new C16414d(j, (DefaultConstructorMarker) null);
            }
            return C16409b.f40665b;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.text.style.TextForegroundStyle$b */
    public static final class C16409b implements TextForegroundStyle {
        @C12579k

        /* renamed from: b */
        public static final C16409b f40665b = new C16409b();

        /* renamed from: c */
        public static final int f40666c = 0;

        /* renamed from: a */
        public long mo47577a() {
            return C15240j2.f37547b.mo42851u();
        }

        @C12580l
        /* renamed from: d */
        public C15421z1 mo47580d() {
            return null;
        }

        public float getAlpha() {
            return Float.NaN;
        }
    }

    /* renamed from: a */
    long mo47577a();

    @C12579k
    /* renamed from: b */
    TextForegroundStyle mo47578b(@C12579k C11289a<? extends TextForegroundStyle> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "other");
        if (!Intrinsics.areEqual((Object) this, (Object) C16409b.f40665b)) {
            return this;
        }
        return (TextForegroundStyle) aVar.invoke();
    }

    @C12579k
    /* renamed from: c */
    TextForegroundStyle mo47579c(@C12579k TextForegroundStyle textForegroundStyle) {
        Intrinsics.checkNotNullParameter(textForegroundStyle, "other");
        boolean z = textForegroundStyle instanceof C16413c;
        if (z && (this instanceof C16413c)) {
            return new C16413c(((C16413c) textForegroundStyle).mo47599i(), C16438l.m74219d(textForegroundStyle.getAlpha(), new TextForegroundStyle$merge$1(this)));
        }
        if (z && !(this instanceof C16413c)) {
            return textForegroundStyle;
        }
        if (z || !(this instanceof C16413c)) {
            return textForegroundStyle.mo47578b(new TextForegroundStyle$merge$2(this));
        }
        return this;
    }

    @C12580l
    /* renamed from: d */
    C15421z1 mo47580d();

    float getAlpha();
}
