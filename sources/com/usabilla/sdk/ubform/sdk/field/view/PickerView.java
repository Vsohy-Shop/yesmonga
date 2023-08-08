package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.constraintlayout.widget.C16934c;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.customViews.UbSpinner;
import com.usabilla.sdk.ubform.sdk.field.contract.C9974f;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10020e;
import com.usabilla.sdk.ubform.sdk.field.view.common.C10038a;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u001fB\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0002R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/PickerView;", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldView;", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/e;", "Lcom/usabilla/sdk/ubform/sdk/field/contract/f$b;", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/a;", "Lkotlin/d2;", "c", "j", "r", "Lcom/usabilla/sdk/ubform/customViews/UbSpinner;", "E0", "Lkotlin/z;", "getSpinner", "()Lcom/usabilla/sdk/ubform/customViews/UbSpinner;", "spinner", "Lcom/usabilla/sdk/ubform/sdk/field/view/PickerView$a;", "F0", "getDataAdapter", "()Lcom/usabilla/sdk/ubform/sdk/field/view/PickerView$a;", "dataAdapter", "", "", "G0", "getItems", "()Ljava/util/List;", "items", "Landroid/content/Context;", "context", "field", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/e;)V", "a", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class PickerView extends FieldView<C10020e> implements C9974f.C9976b, C10038a {
    @C12579k

    /* renamed from: E0 */
    public final C11677z f27540E0;
    @C12579k

    /* renamed from: F0 */
    public final C11677z f27541F0 = C10864b0.m38748c(new PickerView$dataAdapter$2(this));
    @C12579k

    /* renamed from: G0 */
    public final C11677z f27542G0 = C10864b0.m38748c(new PickerView$items$2(this));

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.view.PickerView$a */
    public static final class C10028a extends BaseAdapter implements Filterable {
        @C12579k

        /* renamed from: a */
        public final UbInternalTheme f27543a;
        @C12579k

        /* renamed from: b */
        public final List<String> f27544b;
        @C12579k

        /* renamed from: c */
        public final C10029a f27545c = new C10029a();

        /* renamed from: com.usabilla.sdk.ubform.sdk.field.view.PickerView$a$a */
        public static final class C10029a extends Filter {
            @C12579k
            public Filter.FilterResults performFiltering(@C12580l CharSequence charSequence) {
                return new Filter.FilterResults();
            }

            public void publishResults(@C12580l CharSequence charSequence, @C12580l Filter.FilterResults filterResults) {
            }
        }

        /* renamed from: com.usabilla.sdk.ubform.sdk.field.view.PickerView$a$b */
        public static final class C10030b {

            /* renamed from: a */
            public TextView f27546a;

            @C12579k
            /* renamed from: a */
            public final TextView mo21067a() {
                TextView textView = this.f27546a;
                if (textView != null) {
                    return textView;
                }
                Intrinsics.throwUninitializedPropertyAccessException("title");
                throw null;
            }

            /* renamed from: b */
            public final void mo21068b(@C12579k TextView textView) {
                Intrinsics.checkNotNullParameter(textView, "<set-?>");
                this.f27546a = textView;
            }
        }

        public C10028a(@C12579k UbInternalTheme ubInternalTheme, @C12579k List<String> list) {
            Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
            Intrinsics.checkNotNullParameter(list, "data");
            this.f27543a = ubInternalTheme;
            this.f27544b = list;
        }

        public int getCount() {
            return this.f27544b.size();
        }

        @C12579k
        public Filter getFilter() {
            return this.f27545c;
        }

        @C12579k
        public Object getItem(int i) {
            return this.f27544b.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        @C12579k
        public View getView(int i, @C12580l View view, @C12579k ViewGroup viewGroup) {
            C10030b bVar;
            Intrinsics.checkNotNullParameter(viewGroup, C16934c.f44493V1);
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(C9747c.C9759l.ub_picker_dropdown, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(view, "from(parent.context)\n                    .inflate(R.layout.ub_picker_dropdown, parent, false)");
                bVar = new C10030b();
                View findViewById = view.findViewById(C9747c.C9756i.ub_picker_dropdown_element);
                if (findViewById != null) {
                    bVar.mo21068b((TextView) findViewById);
                    view.setTag(bVar);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
            } else {
                Object tag = view.getTag();
                if (tag != null) {
                    bVar = (C10030b) tag;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.usabilla.sdk.ubform.sdk.field.view.PickerView.UbAdapter.ViewHolder");
                }
            }
            bVar.mo21067a().setTypeface(this.f27543a.getTypefaceRegular());
            bVar.mo21067a().setTextSize((float) this.f27543a.getFonts().getTextSize());
            bVar.mo21067a().setTextColor(this.f27543a.getColors().getText());
            bVar.mo21067a().setText(this.f27544b.get(i));
            return view;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickerView(@C12579k Context context, @C12579k C10020e eVar) {
        super(context, eVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(eVar, "field");
        this.f27540E0 = C10864b0.m38748c(new PickerView$spinner$2(context, this));
    }

    /* access modifiers changed from: private */
    public final C10028a getDataAdapter() {
        return (C10028a) this.f27541F0.getValue();
    }

    /* access modifiers changed from: private */
    public final List<String> getItems() {
        return (List) this.f27542G0.getValue();
    }

    private final UbSpinner getSpinner() {
        return (UbSpinner) this.f27540E0.getValue();
    }

    /* renamed from: p */
    public static final /* synthetic */ C10020e m37832p(PickerView pickerView) {
        return (C10020e) pickerView.getFieldPresenter();
    }

    /* renamed from: c */
    public void mo20831c() {
        if (mo21128l()) {
            getSpinner().setText(getSpinner().getAdapter().getItem(0).toString());
        }
    }

    @C12579k
    /* renamed from: f */
    public Drawable mo21058f(@C12579k UbInternalTheme ubInternalTheme, @C12579k Context context) {
        return C10038a.C10039a.m37930a(this, ubInternalTheme, context);
    }

    /* renamed from: j */
    public void mo20835j() {
        getRootView().addView(getSpinner());
        mo21059r();
    }

    /* renamed from: r */
    public final void mo21059r() {
        int W = ((C10020e) getFieldPresenter()).mo20851W();
        if (W != -1) {
            getSpinner().setText(getSpinner().getAdapter().getItem(W).toString());
        }
    }
}
