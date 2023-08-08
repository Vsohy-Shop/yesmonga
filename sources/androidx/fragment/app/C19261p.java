package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.C19144a;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import com.urbanairship.actions.C35491d;

/* renamed from: androidx.fragment.app.p */
public class C19261p implements LayoutInflater.Factory2 {

    /* renamed from: b */
    public static final String f49581b = "FragmentManager";

    /* renamed from: a */
    public final FragmentManager f49582a;

    /* renamed from: androidx.fragment.app.p$a */
    public class C19262a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C19225e0 f49583a;

        public C19262a(C19225e0 e0Var) {
            this.f49583a = e0Var;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k = this.f49583a.mo57128k();
            this.f49583a.mo57130m();
            SpecialEffectsController.m89940n((ViewGroup) k.mView.getParent(), C19261p.this.f49582a).mo57014j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public C19261p(FragmentManager fragmentManager) {
        this.f49582a = fragmentManager;
    }

    @C0363p0
    public View onCreateView(@C0359n0 String str, @C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    @C0363p0
    public View onCreateView(@C0363p0 View view, @C0359n0 String str, @C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        C19225e0 e0Var;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f49582a);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, C35491d.f87525c);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19144a.C19148d.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C19144a.C19148d.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C19144a.C19148d.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(C19144a.C19148d.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C19250l.m90282b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f49582a.mo56900r0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f49582a.mo56903s0(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f49582a.mo56900r0(id);
        }
        if (fragment == null) {
            fragment = this.f49582a.mo56801G0().mo56932a(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : id;
            fragment.mContainerId = id;
            fragment.mTag = string;
            fragment.mInLayout = true;
            FragmentManager fragmentManager = this.f49582a;
            fragment.mFragmentManager = fragmentManager;
            fragment.mHost = fragmentManager.mo56810J0();
            fragment.onInflate(this.f49582a.mo56810J0().mo57316k(), attributeSet, fragment.mSavedFragmentState);
            e0Var = this.f49582a.mo56888n(fragment);
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragment);
                sb.append(" has been inflated via the <fragment> tag: id=0x");
                sb.append(Integer.toHexString(resourceId));
            }
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            FragmentManager fragmentManager2 = this.f49582a;
            fragment.mFragmentManager = fragmentManager2;
            fragment.mHost = fragmentManager2.mo56810J0();
            fragment.onInflate(this.f49582a.mo56810J0().mo57316k(), attributeSet, fragment.mSavedFragmentState);
            e0Var = this.f49582a.mo56791D(fragment);
            if (FragmentManager.m89694W0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(fragment);
                sb2.append(" has been re-attached via the <fragment> tag: id=0x");
                sb2.append(Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.m90377j(fragment, viewGroup);
        fragment.mContainer = viewGroup;
        e0Var.mo57130m();
        e0Var.mo57127j();
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            fragment.mView.addOnAttachStateChangeListener(new C19262a(e0Var));
            return fragment.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
