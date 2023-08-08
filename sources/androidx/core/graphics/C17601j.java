package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.graphics.j */
public final class C17601j {
    /* renamed from: a */
    public static final void m80652a(@C12579k Canvas canvas, float f, float f2, float f3, float f4, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: b */
    public static final void m80653b(@C12579k Canvas canvas, int i, int i2, int i3, int i4, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: c */
    public static final void m80654c(@C12579k Canvas canvas, @C12579k Path path, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(path, "clipPath");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: d */
    public static final void m80655d(@C12579k Canvas canvas, @C12579k Rect rect, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(rect, "clipRect");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: e */
    public static final void m80656e(@C12579k Canvas canvas, @C12579k RectF rectF, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(rectF, "clipRect");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: f */
    public static final void m80657f(@C12579k Canvas canvas, @C12579k Matrix matrix, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m80658g(Canvas canvas, Matrix matrix, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: h */
    public static final void m80659h(@C12579k Canvas canvas, float f, float f2, float f3, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m80660i(Canvas canvas, float f, float f2, float f3, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: j */
    public static final void m80661j(@C12579k Canvas canvas, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: k */
    public static final void m80662k(@C12579k Canvas canvas, float f, float f2, float f3, float f4, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m80663l(Canvas canvas, float f, float f2, float f3, float f4, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: m */
    public static final void m80664m(@C12579k Canvas canvas, float f, float f2, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m80665n(Canvas canvas, float f, float f2, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: o */
    public static final void m80666o(@C12579k Canvas canvas, float f, float f2, @C12579k C11300l<? super Canvas, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: p */
    public static /* synthetic */ void m80667p(Canvas canvas, float f, float f2, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            lVar.invoke(canvas);
        } finally {
            C11322b0.m43481d(1);
            canvas.restoreToCount(save);
            C11322b0.m43480c(1);
        }
    }
}
