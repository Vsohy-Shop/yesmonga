package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.C16798d;
import androidx.constraintlayout.core.widgets.C16803g;
import androidx.constraintlayout.core.widgets.C16806j;
import androidx.constraintlayout.core.widgets.C16808l;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.VirtualLayout;

public class MotionPlaceholder extends VirtualLayout {

    /* renamed from: E0 */
    public static final String f43162E0 = "MotionPlaceholder";

    /* renamed from: z */
    public C16806j f43163z;

    public MotionPlaceholder(Context context) {
        super(context);
    }

    /* renamed from: G */
    public void mo49929G(C16798d dVar, C16803g gVar, SparseArray<ConstraintWidget> sparseArray) {
    }

    /* renamed from: J */
    public void mo49884J(C16808l lVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (lVar != null) {
            lVar.mo49776v2(mode, size, mode2, size2);
            setMeasuredDimension(lVar.mo49832q2(), lVar.mo49831p2());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo49884J(this.f43163z, i, i2);
    }

    /* renamed from: y */
    public void mo49882y(AttributeSet attributeSet) {
        super.mo49882y(attributeSet);
        this.f44193d = new C16806j();
        mo50647I();
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }
}
