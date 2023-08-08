package androidx.compose.p004ui.text.android.animation;

import android.text.Layout;
import androidx.compose.p004ui.text.android.C16080i;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.p004ui.text.android.C16097m;
import androidx.compose.p004ui.text.android.C16099n;
import androidx.compose.runtime.internal.C8567o;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
@C11363r0({"SMAP\nSegmentBreaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/android/TempListUtilsKt\n*L\n1#1,312:1\n34#2,6:313\n73#2,11:319\n73#2,11:330\n*S KotlinDebug\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n*L\n66#1:313,6\n226#1:319,11\n275#1:330,11\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.animation.b */
public final class C16057b {
    @C12579k

    /* renamed from: a */
    public static final C16057b f39960a = new C16057b();

    /* renamed from: b */
    public static final int f39961b = 0;

    /* renamed from: androidx.compose.ui.text.android.animation.b$a */
    public /* synthetic */ class C16058a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.ui.text.android.animation.SegmentType[] r0 = androidx.compose.p004ui.text.android.animation.SegmentType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.text.android.animation.SegmentType r1 = androidx.compose.p004ui.text.android.animation.SegmentType.Document     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.text.android.animation.SegmentType r1 = androidx.compose.p004ui.text.android.animation.SegmentType.Paragraph     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.text.android.animation.SegmentType r1 = androidx.compose.p004ui.text.android.animation.SegmentType.Line     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.text.android.animation.SegmentType r1 = androidx.compose.p004ui.text.android.animation.SegmentType.Word     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.ui.text.android.animation.SegmentType r1 = androidx.compose.p004ui.text.android.animation.SegmentType.Character     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.android.animation.C16057b.C16058a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final List<Integer> mo46339a(C16099n nVar) {
        CharSequence text = nVar.mo46484d().getText();
        Intrinsics.checkNotNullExpressionValue(text, "text");
        BreakIterator lineInstance = BreakIterator.getLineInstance(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(lineInstance, "getLineInstance(Locale.getDefault())");
        List<Integer> i = mo46347i(text, lineInstance);
        TreeSet treeSet = new TreeSet();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(Integer.valueOf(i.get(i2).intValue()));
        }
        int e = nVar.mo46485e();
        for (int i3 = 0; i3 < e; i3++) {
            Bidi a = nVar.mo46481a(i3);
            if (a != null) {
                int i4 = nVar.mo46488i(i3);
                int runCount = a.getRunCount();
                for (int i5 = 0; i5 < runCount; i5++) {
                    treeSet.add(Integer.valueOf(a.getRunStart(i5) + i4));
                }
            }
        }
        return CollectionsKt___CollectionsKt.m40557Q5(treeSet);
    }

    @C12579k
    /* renamed from: b */
    public final List<Integer> mo46340b(@C12579k C16099n nVar, @C12579k SegmentType segmentType) {
        Intrinsics.checkNotNullParameter(nVar, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        Layout d = nVar.mo46484d();
        CharSequence text = d.getText();
        int i = C16058a.$EnumSwitchMapping$0[segmentType.ordinal()];
        int i2 = 0;
        if (i == 1) {
            return CollectionsKt__CollectionsKt.m40448L(0, Integer.valueOf(text.length()));
        } else if (i == 2) {
            List<Integer> P = CollectionsKt__CollectionsKt.m40452P(0);
            int e = nVar.mo46485e();
            while (i2 < e) {
                P.add(Integer.valueOf(nVar.mo46486f(i2)));
                i2++;
            }
            return P;
        } else if (i == 3) {
            List<Integer> P2 = CollectionsKt__CollectionsKt.m40452P(0);
            int lineCount = d.getLineCount();
            while (i2 < lineCount) {
                P2.add(Integer.valueOf(d.getLineEnd(i2)));
                i2++;
            }
            return P2;
        } else if (i == 4) {
            return mo46339a(nVar);
        } else {
            if (i == 5) {
                Intrinsics.checkNotNullExpressionValue(text, "text");
                BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
                Intrinsics.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(Locale.getDefault())");
                return mo46347i(text, characterInstance);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public final List<C16056a> mo46341c(C16099n nVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        C16099n nVar2 = nVar;
        ArrayList arrayList = new ArrayList();
        List<Integer> b = mo46340b(nVar2, SegmentType.Character);
        if (b.size() != 0) {
            boolean z4 = true;
            if (b.size() != 1) {
                ArrayList arrayList2 = new ArrayList();
                boolean z5 = false;
                Integer num = b.get(0);
                int G = CollectionsKt__CollectionsKt.m40443G(b);
                int i2 = 0;
                while (i2 < G) {
                    i2++;
                    Integer num2 = b.get(i2);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    Layout d = nVar.mo46484d();
                    if (!z || intValue != intValue2 + 1 || !nVar2.mo46489j(d.getText().charAt(intValue2))) {
                        int a = C16097m.m72497a(d, intValue2, z5);
                        if (d.getParagraphDirection(a) == -1) {
                            z2 = z4;
                        } else {
                            z2 = z5;
                        }
                        boolean isRtlCharAt = d.isRtlCharAt(intValue2);
                        if (isRtlCharAt != z2) {
                            z4 = z5;
                        }
                        Layout layout = d;
                        int ceil = (int) ((float) Math.ceil((double) nVar2.mo46483c(intValue2, z4, z5)));
                        if (isRtlCharAt == z2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        i = G;
                        int ceil2 = (int) ((float) Math.ceil((double) nVar2.mo46483c(intValue, z3, true)));
                        Layout layout2 = layout;
                        arrayList.add(new C16056a(intValue2, intValue, Math.min(ceil, ceil2), layout2.getLineTop(a), Math.max(ceil, ceil2), layout2.getLineBottom(a)));
                    } else {
                        i = G;
                    }
                    arrayList2.add(C11079d2.f28267a);
                    num = num2;
                    G = i;
                    z4 = true;
                    z5 = false;
                }
                return arrayList;
            }
        }
        CollectionsKt__CollectionsKt.m40441E();
        return arrayList;
    }

    /* renamed from: d */
    public final List<C16056a> mo46342d(C16099n nVar) {
        return C10976s.m41419k(new C16056a(0, nVar.mo46484d().getText().length(), 0, 0, nVar.mo46484d().getWidth(), nVar.mo46484d().getHeight()));
    }

    /* renamed from: e */
    public final List<C16056a> mo46343e(C16099n nVar, boolean z) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        Layout d = nVar.mo46484d();
        int lineCount = nVar.mo46484d().getLineCount();
        for (int i3 = 0; i3 < lineCount; i3++) {
            int lineStart = d.getLineStart(i3);
            int lineEnd = d.getLineEnd(i3);
            if (z) {
                i = (int) ((float) Math.ceil((double) d.getLineLeft(i3)));
            } else {
                i = 0;
            }
            int lineTop = d.getLineTop(i3);
            if (z) {
                i2 = (int) ((float) Math.ceil((double) d.getLineRight(i3)));
            } else {
                i2 = d.getWidth();
            }
            arrayList.add(new C16056a(lineStart, lineEnd, i, lineTop, i2, d.getLineBottom(i3)));
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List<C16056a> mo46344f(C16099n nVar) {
        ArrayList arrayList = new ArrayList();
        Layout d = nVar.mo46484d();
        int e = nVar.mo46485e();
        for (int i = 0; i < e; i++) {
            int i2 = nVar.mo46488i(i);
            int f = nVar.mo46486f(i);
            arrayList.add(new C16056a(i2, f, 0, d.getLineTop(C16097m.m72497a(d, i2, false)), d.getWidth(), d.getLineBottom(C16097m.m72497a(d, f, true))));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final List<C16056a> mo46345g(C16099n nVar, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        C16099n nVar2 = nVar;
        Layout d = nVar.mo46484d();
        int ceil = (int) ((float) Math.ceil((double) d.getPaint().measureText(" ")));
        List<Integer> b = mo46340b(nVar2, SegmentType.Word);
        if (b.size() != 0) {
            boolean z4 = true;
            if (b.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z5 = false;
                Integer num = b.get(0);
                int G = CollectionsKt__CollectionsKt.m40443G(b);
                int i2 = 0;
                while (i2 < G) {
                    i2++;
                    Integer num2 = b.get(i2);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    int a = C16097m.m72497a(d, intValue2, z5);
                    if (d.getParagraphDirection(a) == -1) {
                        z2 = z4;
                    } else {
                        z2 = z5;
                    }
                    boolean isRtlCharAt = d.isRtlCharAt(intValue2);
                    if (isRtlCharAt != z2) {
                        z4 = z5;
                    }
                    int i3 = a;
                    int ceil2 = (int) ((float) Math.ceil((double) nVar2.mo46483c(intValue2, z4, z5)));
                    if (isRtlCharAt == z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i4 = G;
                    int ceil3 = (int) ((float) Math.ceil((double) nVar2.mo46483c(intValue, z3, true)));
                    int min = Math.min(ceil2, ceil3);
                    int max = Math.max(ceil2, ceil3);
                    if (!z || intValue == 0 || d.getText().charAt(intValue - 1) != ' ') {
                        i = i3;
                    } else {
                        i = i3;
                        if (d.getLineEnd(i) != intValue) {
                            if (isRtlCharAt) {
                                min += ceil;
                            } else {
                                max -= ceil;
                            }
                        }
                    }
                    arrayList.add(new C16056a(intValue2, intValue, min, d.getLineTop(i), max, d.getLineBottom(i)));
                    num = num2;
                    G = i4;
                    z4 = true;
                    z5 = false;
                }
                return arrayList;
            }
        }
        return CollectionsKt__CollectionsKt.m40441E();
    }

    @C12579k
    /* renamed from: h */
    public final List<C16056a> mo46346h(@C12579k C16099n nVar, @C12579k SegmentType segmentType, boolean z) {
        Intrinsics.checkNotNullParameter(nVar, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        int i = C16058a.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i == 1) {
            return mo46342d(nVar);
        }
        if (i == 2) {
            return mo46344f(nVar);
        }
        if (i == 3) {
            return mo46343e(nVar, z);
        }
        if (i == 4) {
            return mo46345g(nVar, z);
        }
        if (i == 5) {
            return mo46341c(nVar, z);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: i */
    public final List<Integer> mo46347i(CharSequence charSequence, BreakIterator breakIterator) {
        C16080i iVar = new C16080i(charSequence, 0, charSequence.length());
        List<Integer> P = CollectionsKt__CollectionsKt.m40452P(0);
        breakIterator.setText(iVar);
        while (breakIterator.next() != -1) {
            P.add(Integer.valueOf(breakIterator.current()));
        }
        return P;
    }
}
