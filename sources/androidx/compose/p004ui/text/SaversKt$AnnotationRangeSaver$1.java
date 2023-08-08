package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.runtime.saveable.C8629f;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/ui/text/d$b;", "", "it", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/ui/text/d$b;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1 */
public final class SaversKt$AnnotationRangeSaver$1 extends Lambda implements C11304p<C8629f, C16156d.C16159b<? extends Object>, Object> {

    /* renamed from: f */
    public static final SaversKt$AnnotationRangeSaver$1 f39886f = new SaversKt$AnnotationRangeSaver$1();

    /* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1$a */
    public /* synthetic */ class C16048a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.ui.text.AnnotationType[] r0 = androidx.compose.p004ui.text.AnnotationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.p004ui.text.AnnotationType.Paragraph     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.p004ui.text.AnnotationType.Span     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.p004ui.text.AnnotationType.VerbatimTts     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.p004ui.text.AnnotationType.Url     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.ui.text.AnnotationType r1 = androidx.compose.p004ui.text.AnnotationType.String     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.SaversKt$AnnotationRangeSaver$1.C16048a.<clinit>():void");
        }
    }

    public SaversKt$AnnotationRangeSaver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final Object invoke(@C12579k C8629f fVar, @C12579k C16156d.C16159b<? extends Object> bVar) {
        AnnotationType annotationType;
        Object obj;
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        Intrinsics.checkNotNullParameter(bVar, "it");
        Object h = bVar.mo46738h();
        if (h instanceof C16451t) {
            annotationType = AnnotationType.Paragraph;
        } else if (h instanceof C16151c0) {
            annotationType = AnnotationType.Span;
        } else if (h instanceof C16452t0) {
            annotationType = AnnotationType.VerbatimTts;
        } else if (h instanceof C16407s0) {
            annotationType = AnnotationType.Url;
        } else {
            annotationType = AnnotationType.String;
        }
        int i = C16048a.$EnumSwitchMapping$0[annotationType.ordinal()];
        if (i == 1) {
            Object h2 = bVar.mo46738h();
            Intrinsics.checkNotNull(h2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
            obj = SaversKt.m72311z((C16451t) h2, SaversKt.m72292g(), fVar);
        } else if (i == 2) {
            Object h3 = bVar.mo46738h();
            Intrinsics.checkNotNull(h3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
            obj = SaversKt.m72311z((C16151c0) h3, SaversKt.m72305t(), fVar);
        } else if (i == 3) {
            Object h4 = bVar.mo46738h();
            Intrinsics.checkNotNull(h4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
            obj = SaversKt.m72311z((C16452t0) h4, SaversKt.f39866d, fVar);
        } else if (i == 4) {
            Object h5 = bVar.mo46738h();
            Intrinsics.checkNotNull(h5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
            obj = SaversKt.m72311z((C16407s0) h5, SaversKt.f39867e, fVar);
        } else if (i == 5) {
            obj = SaversKt.m72310y(bVar.mo46738h());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt__CollectionsKt.m40463r(SaversKt.m72310y(annotationType), obj, SaversKt.m72310y(Integer.valueOf(bVar.mo46740i())), SaversKt.m72310y(Integer.valueOf(bVar.mo46737g())), SaversKt.m72310y(bVar.mo46741j()));
    }
}
