package com.contentsquare.android.internal.features.clientmode.p024ui.developer;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0475e;
import com.contentsquare.android.C14147n;
import com.contentsquare.android.sdk.C14794v6;

/* renamed from: com.contentsquare.android.internal.features.clientmode.ui.developer.DeveloperActivationActivity */
public class DeveloperActivationActivity extends C0475e {

    /* renamed from: U0 */
    public C14794v6 f34945U0;

    /* renamed from: com.contentsquare.android.internal.features.clientmode.ui.developer.DeveloperActivationActivity$a */
    public class C14128a implements TextView.OnEditorActionListener {
        public C14128a() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 2) {
                return false;
            }
            DeveloperActivationActivity.this.mo34389T0(textView.getText().toString());
            return true;
        }
    }

    /* renamed from: com.contentsquare.android.internal.features.clientmode.ui.developer.DeveloperActivationActivity$b */
    public class C14129b implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ EditText f34947a;

        public C14129b(EditText editText) {
            this.f34947a = editText;
        }

        public void onClick(View view) {
            DeveloperActivationActivity.this.mo34389T0(this.f34947a.getText().toString());
        }
    }

    /* renamed from: T0 */
    public final void mo34389T0(String str) {
        if (this.f34945U0.mo36629b(str)) {
            this.f34945U0.mo36628a();
            setResult(-1);
            finish();
            return;
        }
        Toast.makeText(this, "Invalid password.", 0).show();
    }

    /* renamed from: a */
    public final void mo34390a() {
        EditText editText = (EditText) findViewById(C14147n.C14153f.developer_password);
        editText.setOnEditorActionListener(new C14128a());
        ((Button) findViewById(C14147n.C14153f.developer_password_button)).setOnClickListener(new C14129b(editText));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f34945U0 == null) {
            this.f34945U0 = new C14794v6(getApplication());
        }
        setContentView(C14147n.C14154g.contentsquare_developer_activation_activity);
        mo34390a();
        setFinishOnTouchOutside(false);
    }
}
