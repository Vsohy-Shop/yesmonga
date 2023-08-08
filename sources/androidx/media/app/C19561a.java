package androidx.media.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17073f0;
import androidx.core.app.C17075f2;
import androidx.media.C19634t;

/* renamed from: androidx.media.app.a */
public class C19561a {

    /* renamed from: androidx.media.app.a$a */
    public static class C19562a extends C19563b {
        /* renamed from: E */
        public int mo57871E(int i) {
            return i <= 3 ? C19634t.C19641g.notification_template_big_media_narrow_custom : C19634t.C19641g.notification_template_big_media_custom;
        }

        /* renamed from: F */
        public int mo57872F() {
            if (this.f45299a.mo51411s() != null) {
                return C19634t.C19641g.notification_template_media_custom;
            }
            return super.mo57872F();
        }

        /* renamed from: L */
        public final void mo57873L(RemoteViews remoteViews) {
            int i;
            if (this.f45299a.mo51409r() != 0) {
                i = this.f45299a.mo51409r();
            } else {
                i = this.f45299a.f45220a.getResources().getColor(C19634t.C19636b.notification_material_background_media_default_color);
            }
            remoteViews.setInt(C19634t.C19639e.status_bar_latest_event_content, "setBackgroundColor", i);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: b */
        public void mo51315b(C17073f0 f0Var) {
            f0Var.mo51268a().setStyle(mo57874A(new Notification.DecoratedMediaCustomViewStyle()));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: v */
        public RemoteViews mo51447v(C17073f0 f0Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: w */
        public RemoteViews mo51448w(C17073f0 f0Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: x */
        public RemoteViews mo51449x(C17073f0 f0Var) {
            return null;
        }
    }

    /* renamed from: androidx.media.app.a$b */
    public static class C19563b extends C17075f2.C17105q {

        /* renamed from: i */
        public static final int f50065i = 3;

        /* renamed from: j */
        public static final int f50066j = 5;

        /* renamed from: e */
        public int[] f50067e = null;

        /* renamed from: f */
        public MediaSessionCompat.Token f50068f;

        /* renamed from: g */
        public boolean f50069g;

        /* renamed from: h */
        public PendingIntent f50070h;

        public C19563b() {
        }

        /* renamed from: G */
        public static MediaSessionCompat.Token m91090G(Notification notification) {
            Parcelable parcelable;
            Bundle n = C17075f2.m78942n(notification);
            if (n == null || (parcelable = n.getParcelable(C17075f2.f45076c0)) == null) {
                return null;
            }
            return MediaSessionCompat.Token.m632b(parcelable);
        }

        @C0376v0(21)
        /* renamed from: A */
        public Notification.MediaStyle mo57874A(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.f50067e;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.f50068f;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.mo419f());
            }
            return mediaStyle;
        }

        /* renamed from: B */
        public RemoteViews mo57875B() {
            int min = Math.min(this.f45299a.f45221b.size(), 5);
            RemoteViews c = mo51479c(false, mo57871E(min), false);
            c.removeAllViews(C19634t.C19639e.media_actions);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    c.addView(C19634t.C19639e.media_actions, mo57877D(this.f45299a.f45221b.get(i)));
                }
            }
            if (this.f50069g) {
                int i2 = C19634t.C19639e.cancel_action;
                c.setViewVisibility(i2, 0);
                c.setInt(i2, "setAlpha", this.f45299a.f45220a.getResources().getInteger(C19634t.C19640f.cancel_button_image_alpha));
                c.setOnClickPendingIntent(i2, this.f50070h);
            } else {
                c.setViewVisibility(C19634t.C19639e.cancel_action, 8);
            }
            return c;
        }

        /* renamed from: C */
        public RemoteViews mo57876C() {
            int i;
            RemoteViews c = mo51479c(false, mo57872F(), true);
            int size = this.f45299a.f45221b.size();
            int[] iArr = this.f50067e;
            if (iArr == null) {
                i = 0;
            } else {
                i = Math.min(iArr.length, 3);
            }
            c.removeAllViews(C19634t.C19639e.media_actions);
            if (i > 0) {
                int i2 = 0;
                while (i2 < i) {
                    if (i2 < size) {
                        c.addView(C19634t.C19639e.media_actions, mo57877D(this.f45299a.f45221b.get(this.f50067e[i2])));
                        i2++;
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                    }
                }
            }
            if (this.f50069g) {
                c.setViewVisibility(C19634t.C19639e.end_padder, 8);
                int i3 = C19634t.C19639e.cancel_action;
                c.setViewVisibility(i3, 0);
                c.setOnClickPendingIntent(i3, this.f50070h);
                c.setInt(i3, "setAlpha", this.f45299a.f45220a.getResources().getInteger(C19634t.C19640f.cancel_button_image_alpha));
            } else {
                c.setViewVisibility(C19634t.C19639e.end_padder, 0);
                c.setViewVisibility(C19634t.C19639e.cancel_action, 8);
            }
            return c;
        }

        /* renamed from: D */
        public final RemoteViews mo57877D(C17075f2.C17077b bVar) {
            boolean z;
            if (bVar.mo51269a() == null) {
                z = true;
            } else {
                z = false;
            }
            RemoteViews remoteViews = new RemoteViews(this.f45299a.f45220a.getPackageName(), C19634t.C19641g.notification_media_action);
            int i = C19634t.C19639e.action0;
            remoteViews.setImageViewResource(i, bVar.mo51273e());
            if (!z) {
                remoteViews.setOnClickPendingIntent(i, bVar.mo51269a());
            }
            remoteViews.setContentDescription(i, bVar.mo51278j());
            return remoteViews;
        }

        /* renamed from: E */
        public int mo57871E(int i) {
            return i <= 3 ? C19634t.C19641g.notification_template_big_media_narrow : C19634t.C19641g.notification_template_big_media;
        }

        /* renamed from: F */
        public int mo57872F() {
            return C19634t.C19641g.notification_template_media;
        }

        /* renamed from: H */
        public C19563b mo57878H(PendingIntent pendingIntent) {
            this.f50070h = pendingIntent;
            return this;
        }

        /* renamed from: I */
        public C19563b mo57879I(MediaSessionCompat.Token token) {
            this.f50068f = token;
            return this;
        }

        /* renamed from: J */
        public C19563b mo57880J(int... iArr) {
            this.f50067e = iArr;
            return this;
        }

        /* renamed from: K */
        public C19563b mo57881K(boolean z) {
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: b */
        public void mo51315b(C17073f0 f0Var) {
            f0Var.mo51268a().setStyle(mo57874A(new Notification.MediaStyle()));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: v */
        public RemoteViews mo51447v(C17073f0 f0Var) {
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: w */
        public RemoteViews mo51448w(C17073f0 f0Var) {
            return null;
        }

        public C19563b(C17075f2.C17092g gVar) {
            mo51489z(gVar);
        }
    }
}
