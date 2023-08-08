package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.C0441a;

/* renamed from: androidx.appcompat.app.y */
public class C0504y implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public final C0441a.C0446e f1284a;

    public C0504y(C0441a.C0446e eVar) {
        this.f1284a = eVar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0441a.C0446e eVar = this.f1284a;
        if (eVar != null) {
            eVar.mo1317a(i, j);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
