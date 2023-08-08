package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.preference.C19975v;

public class DropDownPreference extends ListPreference {

    /* renamed from: u1 */
    public final Context f50821u1;

    /* renamed from: v1 */
    public final ArrayAdapter f50822v1;

    /* renamed from: w1 */
    public Spinner f50823w1;

    /* renamed from: x1 */
    public final AdapterView.OnItemSelectedListener f50824x1;

    /* renamed from: androidx.preference.DropDownPreference$a */
    public class C19891a implements AdapterView.OnItemSelectedListener {
        public C19891a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.mo58790E3()[i].toString();
                if (!charSequence.equals(DropDownPreference.this.mo58791F3()) && DropDownPreference.this.mo58882g(charSequence)) {
                    DropDownPreference.this.mo58796L3(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: G1 */
    public void mo58762G1() {
        super.mo58762G1();
        ArrayAdapter arrayAdapter = this.f50822v1;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* renamed from: I3 */
    public void mo58763I3(@C0359n0 CharSequence[] charSequenceArr) {
        super.mo58763I3(charSequenceArr);
        mo58767P3();
    }

    /* renamed from: M3 */
    public void mo58764M3(int i) {
        mo58796L3(mo58790E3()[i].toString());
    }

    @C0359n0
    /* renamed from: N3 */
    public ArrayAdapter mo58765N3() {
        return new ArrayAdapter(this.f50821u1, 17367049);
    }

    /* renamed from: O3 */
    public final int mo58766O3(String str) {
        CharSequence[] E3 = mo58790E3();
        if (str == null || E3 == null) {
            return -1;
        }
        for (int length = E3.length - 1; length >= 0; length--) {
            if (TextUtils.equals(E3[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: P3 */
    public final void mo58767P3() {
        this.f50822v1.clear();
        if (mo58788C3() != null) {
            for (CharSequence charSequence : mo58788C3()) {
                this.f50822v1.add(charSequence.toString());
            }
        }
    }

    /* renamed from: Q1 */
    public void mo34405Q1(@C0359n0 C19974u uVar) {
        Spinner spinner = (Spinner) uVar.itemView.findViewById(C19975v.C19981f.spinner);
        this.f50823w1 = spinner;
        spinner.setAdapter(this.f50822v1);
        this.f50823w1.setOnItemSelectedListener(this.f50824x1);
        this.f50823w1.setSelection(mo58766O3(mo58791F3()));
        super.mo34405Q1(uVar);
    }

    /* renamed from: T1 */
    public void mo58744T1() {
        this.f50823w1.performClick();
    }

    public DropDownPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C19975v.C19976a.dropdownPreferenceStyle);
    }

    public DropDownPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f50824x1 = new C19891a();
        this.f50821u1 = context;
        this.f50822v1 = mo58765N3();
        mo58767P3();
    }
}
