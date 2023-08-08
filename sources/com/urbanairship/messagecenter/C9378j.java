package com.urbanairship.messagecenter;

import androidx.annotation.RestrictTo;
import androidx.room.C20282b0;
import androidx.room.C20293d2;
import androidx.room.C20312g;
import androidx.room.C20352p0;
import com.urbanairship.C36059m;
import com.urbanairship.analytics.data.C35533a;
import java.util.Collections;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@C20312g
/* renamed from: com.urbanairship.messagecenter.j */
public abstract class C9378j {
    @C20293d2
    @C20352p0("UPDATE richpush SET unread = 1 WHERE message_id IN (:messageIds)")
    /* renamed from: A */
    public abstract void mo19010A(List<String> list);

    /* renamed from: B */
    public boolean mo19011B(String str) {
        try {
            return mo19012C(str);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to check if message exists!", new Object[0]);
            return false;
        }
    }

    @C20352p0("SELECT EXISTS (SELECT 1 FROM richpush WHERE message_id = :id)")
    /* renamed from: C */
    public abstract boolean mo19012C(String str);

    /* renamed from: b */
    public void mo19013b() {
        try {
            mo19014c();
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to delete all messages!", new Object[0]);
        }
    }

    @C20293d2
    @C20352p0("DELETE FROM richpush")
    /* renamed from: c */
    public abstract void mo19014c();

    /* renamed from: d */
    public void mo19015d(List<String> list) {
        try {
            mo19017f(list);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to delete messages!", new Object[0]);
        }
    }

    @C20352p0("DELETE FROM richpush WHERE message_id IN (:messageIds)")
    /* renamed from: e */
    public abstract void m35273s(List<String> list);

    @C20293d2
    /* renamed from: f */
    public void mo19017f(List<String> list) {
        C35533a.m146617b(list, new C9377i(this));
    }

    /* renamed from: g */
    public List<C9383m> mo19018g() {
        try {
            return mo19019h();
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get locally deleted messages!", new Object[0]);
            return Collections.emptyList();
        }
    }

    @C20293d2
    @C20352p0("SELECT * FROM richpush WHERE deleted = 1")
    /* renamed from: h */
    public abstract List<C9383m> mo19019h();

    /* renamed from: i */
    public List<C9383m> mo19020i() {
        try {
            return mo19021j();
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get locally read messages!", new Object[0]);
            return Collections.emptyList();
        }
    }

    @C20293d2
    @C20352p0("SELECT * FROM richpush WHERE unread = 0 AND unread <> unread_orig")
    /* renamed from: j */
    public abstract List<C9383m> mo19021j();

    /* renamed from: k */
    public List<String> mo19022k() {
        try {
            return mo19023l();
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get message IDs!", new Object[0]);
            return Collections.emptyList();
        }
    }

    @C20293d2
    @C20352p0("SELECT message_id FROM richpush")
    /* renamed from: l */
    public abstract List<String> mo19023l();

    /* renamed from: m */
    public List<C9383m> mo19024m() {
        try {
            return mo19025n();
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get messages!", new Object[0]);
            return Collections.emptyList();
        }
    }

    @C20293d2
    @C20352p0("SELECT * FROM richpush")
    /* renamed from: n */
    public abstract List<C9383m> mo19025n();

    /* renamed from: o */
    public void mo19026o(C9383m mVar) {
        try {
            mo19027p(mVar);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to insert message!", new Object[0]);
        }
    }

    @C20282b0(onConflict = 1)
    /* renamed from: p */
    public abstract void mo19027p(C9383m mVar);

    /* renamed from: q */
    public void mo19028q(List<C9383m> list) {
        try {
            mo19029r(list);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to insert messages!", new Object[0]);
        }
    }

    @C20282b0(onConflict = 1)
    /* renamed from: r */
    public abstract void mo19029r(List<C9383m> list);

    /* renamed from: t */
    public void mo19030t(List<String> list) {
        try {
            mo19031u(list);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to mark messages as deleted!", new Object[0]);
        }
    }

    @C20293d2
    @C20352p0("UPDATE richpush SET deleted = 1 WHERE message_id IN (:messageIds)")
    /* renamed from: u */
    public abstract void mo19031u(List<String> list);

    /* renamed from: v */
    public void mo19032v(List<String> list) {
        try {
            mo19033w(list);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to mark messages as read!", new Object[0]);
        }
    }

    @C20293d2
    @C20352p0("UPDATE richpush SET unread = 0 WHERE message_id IN (:messageIds)")
    /* renamed from: w */
    public abstract void mo19033w(List<String> list);

    /* renamed from: x */
    public void mo19034x(List<String> list) {
        try {
            mo19035y(list);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to mark messages as read (origin)!", new Object[0]);
        }
    }

    @C20293d2
    @C20352p0("UPDATE richpush SET unread_orig = 0 WHERE message_id IN (:messageIds)")
    /* renamed from: y */
    public abstract void mo19035y(List<String> list);

    /* renamed from: z */
    public void mo19036z(List<String> list) {
        try {
            mo19010A(list);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to mark messages as unread!", new Object[0]);
        }
    }
}
