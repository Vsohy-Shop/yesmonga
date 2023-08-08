package androidx.compose.p004ui.text;

import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1#1,980:1\n850#1,16:981\n850#1,16:997\n850#1,16:1013\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n800#1:981,16\n820#1:997,16\n840#1:1013,16\n*E\n"})
/* renamed from: androidx.compose.ui.text.m */
public final class C16353m {
    /* renamed from: a */
    public static final <T> int m73681a(List<? extends T> list, C11300l<? super T, Integer> lVar) {
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int intValue = lVar.invoke(list.get(i2)).intValue();
            if (intValue < 0) {
                i = i2 + 1;
            } else if (intValue <= 0) {
                return i2;
            } else {
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: b */
    public static final int m73682b(@C12579k List<C16358o> list, int i) {
        char c;
        Intrinsics.checkNotNullParameter(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C16358o oVar = list.get(i3);
            if (oVar.mo47450o() > i) {
                c = 1;
            } else if (oVar.mo47446k() <= i) {
                c = 65535;
            } else {
                c = 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: c */
    public static final int m73683c(@C12579k List<C16358o> list, int i) {
        char c;
        Intrinsics.checkNotNullParameter(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C16358o oVar = list.get(i3);
            if (oVar.mo47451p() > i) {
                c = 1;
            } else if (oVar.mo47447l() <= i) {
                c = 65535;
            } else {
                c = 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: d */
    public static final int m73684d(@C12579k List<C16358o> list, float f) {
        char c;
        Intrinsics.checkNotNullParameter(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C16358o oVar = list.get(i2);
            if (oVar.mo47452q() > f) {
                c = 1;
            } else if (oVar.mo47445j() <= f) {
                c = 65535;
            } else {
                c = 0;
            }
            if (c < 0) {
                i = i2 + 1;
            } else if (c <= 0) {
                return i2;
            } else {
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }
}
