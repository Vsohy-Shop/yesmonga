package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.legacy.app.C19322a;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.app.c */
public class C0463c {

    /* renamed from: a */
    public static final String f1155a = "ActionBarDrawerToggleHC";

    /* renamed from: b */
    public static final int[] f1156b = {16843531};

    /* renamed from: androidx.appcompat.app.c$a */
    public static class C0464a {

        /* renamed from: a */
        public Method f1157a;

        /* renamed from: b */
        public Method f1158b;

        /* renamed from: c */
        public ImageView f1159c;

        public C0464a(Activity activity) {
            Class<ActionBar> cls = ActionBar.class;
            try {
                this.f1157a = cls.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f1158b = cls.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(C19322a.f49638p);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                        if (childAt instanceof ImageView) {
                            this.f1159c = (ImageView) childAt;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static Drawable m1990a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f1156b);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: b */
    public static C0464a m1991b(C0464a aVar, Activity activity, int i) {
        if (aVar == null) {
            aVar = new C0464a(activity);
        }
        if (aVar.f1157a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f1158b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused) {
            }
        }
        return aVar;
    }

    /* renamed from: c */
    public static C0464a m1992c(Activity activity, Drawable drawable, int i) {
        C0464a aVar = new C0464a(activity);
        if (aVar.f1157a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f1157a.invoke(actionBar, new Object[]{drawable});
                aVar.f1158b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused) {
            }
        } else {
            ImageView imageView = aVar.f1159c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        return aVar;
    }
}
