package androidx.transition;

import android.view.View;
import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.C12412q;

/* renamed from: androidx.transition.p0 */
public class C20657p0 {

    /* renamed from: a */
    public final Map<String, Object> f53279a = new HashMap();

    /* renamed from: b */
    public View f53280b;

    /* renamed from: c */
    public final ArrayList<C20606h0> f53281c = new ArrayList<>();

    @Deprecated
    public C20657p0() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C20657p0)) {
            return false;
        }
        C20657p0 p0Var = (C20657p0) obj;
        if (this.f53280b != p0Var.f53280b || !this.f53279a.equals(p0Var.f53279a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f53280b.hashCode() * 31) + this.f53279a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f53280b + "\n") + "    values:";
        for (String next : this.f53279a.keySet()) {
            str = str + C12412q.f30348a + next + ": " + this.f53279a.get(next) + "\n";
        }
        return str;
    }

    public C20657p0(@C0359n0 View view) {
        this.f53280b = view;
    }
}
