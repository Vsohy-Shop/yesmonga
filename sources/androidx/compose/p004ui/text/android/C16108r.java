package androidx.compose.p004ui.text.android;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import androidx.compose.p004ui.text.android.style.C16120e;
import androidx.compose.p004ui.text.android.style.C16121f;
import java.text.BreakIterator;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLayoutIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1855#2,2:172\n*S KotlinDebug\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n*L\n142#1:172,2\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.r */
public final class C16108r {
    /* renamed from: c */
    public static final float m72549c(@C12579k CharSequence charSequence, @C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i = 0;
        lineInstance.setText(new C16080i(charSequence, 0, charSequence.length()));
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(10, new C16106q());
        int next = lineInstance.next();
        while (true) {
            int i2 = i;
            i = next;
            int i3 = i2;
            if (i == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i3), Integer.valueOf(i)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.mo21851f()).intValue() - ((Number) pair.mo21849e()).intValue() < i - i3) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i3), Integer.valueOf(i)));
                }
            }
            next = lineInstance.next();
        }
        float f = 0.0f;
        for (Pair pair2 : priorityQueue) {
            f = Math.max(f, Layout.getDesiredWidth(charSequence, ((Number) pair2.mo21846a()).intValue(), ((Number) pair2.mo21847b()).intValue(), textPaint));
        }
        return f;
    }

    /* renamed from: d */
    public static final int m72550d(Pair pair, Pair pair2) {
        return (((Number) pair.mo21851f()).intValue() - ((Number) pair.mo21849e()).intValue()) - (((Number) pair2.mo21851f()).intValue() - ((Number) pair2.mo21849e()).intValue());
    }

    /* renamed from: e */
    public static final boolean m72551e(float f, CharSequence charSequence, TextPaint textPaint) {
        boolean z;
        boolean z2;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (C16138v.m72612a(spanned, C16121f.class) || C16138v.m72612a(spanned, C16120e.class)) {
                    return true;
                }
            }
            if (textPaint.getLetterSpacing() == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }
}
