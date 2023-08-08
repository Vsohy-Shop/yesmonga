package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.viewpager2.widget.a */
public final class C20828a {

    /* renamed from: b */
    public static final ViewGroup.MarginLayoutParams f53858b;

    /* renamed from: a */
    public LinearLayoutManager f53859a;

    /* renamed from: androidx.viewpager2.widget.a$a */
    public class C20829a implements Comparator<int[]> {
        public C20829a() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f53858b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C20828a(@C0359n0 LinearLayoutManager linearLayoutManager) {
        this.f53859a = linearLayoutManager;
    }

    /* renamed from: c */
    public static boolean m96698c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m96698c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo62529a() {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int Y = this.f53859a.mo59922Y();
        if (Y == 0) {
            return true;
        }
        if (this.f53859a.mo59379M2() == 0) {
            z = true;
        } else {
            z = false;
        }
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = Y;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        int i5 = 0;
        while (i5 < Y) {
            View X = this.f53859a.mo59919X(i5);
            if (X != null) {
                ViewGroup.LayoutParams layoutParams = X.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f53858b;
                }
                int[] iArr3 = iArr2[i5];
                if (z) {
                    i2 = X.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    i2 = X.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr3[0] = i2 - i;
                int[] iArr4 = iArr2[i5];
                if (z) {
                    i4 = X.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i4 = X.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i4 + i3;
                i5++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new C20829a());
        for (int i6 = 1; i6 < Y; i6++) {
            if (iArr2[i6 - 1][1] != iArr2[i6][0]) {
                return false;
            }
        }
        int[] iArr5 = iArr2[0];
        int i7 = iArr5[1];
        int i8 = iArr5[0];
        int i9 = i7 - i8;
        if (i8 > 0 || iArr2[Y - 1][1] < i9) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo62530b() {
        int Y = this.f53859a.mo59922Y();
        for (int i = 0; i < Y; i++) {
            if (m96698c(this.f53859a.mo59919X(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo62531d() {
        if ((!mo62529a() || this.f53859a.mo59922Y() <= 1) && mo62530b()) {
            return true;
        }
        return false;
    }
}
