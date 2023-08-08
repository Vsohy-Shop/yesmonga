package com.urbanairship.messagecenter;

import android.content.res.Resources;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import androidx.annotation.C0359n0;
import com.urbanairship.messagecenter.C9401y;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.urbanairship.messagecenter.b */
public class C9352b implements AbsListView.MultiChoiceModeListener {

    /* renamed from: a */
    public final C9396w f25549a;

    public C9352b(@C0359n0 C9396w wVar) {
        this.f25549a = wVar;
    }

    @C0359n0
    /* renamed from: a */
    public final Set<String> mo18906a() {
        C9371g T0;
        HashSet hashSet = new HashSet();
        if (this.f25549a.mo19064Q0() == null) {
            return hashSet;
        }
        SparseBooleanArray checkedItemPositions = this.f25549a.mo19064Q0().getCheckedItemPositions();
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            if (checkedItemPositions.valueAt(i) && (T0 = this.f25549a.mo19067T0(checkedItemPositions.keyAt(i))) != null) {
                hashSet.add(T0.mo18977W());
            }
        }
        return hashSet;
    }

    public boolean onActionItemClicked(@C0359n0 ActionMode actionMode, @C0359n0 MenuItem menuItem) {
        AbsListView Q0 = this.f25549a.mo19064Q0();
        if (Q0 == null) {
            return false;
        }
        Resources resources = Q0.getContext().getResources();
        if (menuItem.getItemId() == C9401y.C9409h.mark_read) {
            C9372h.m35254H().mo18999B().mo18942y(mo18906a());
            int size = mo18906a().size();
            Q0.announceForAccessibility(resources.getQuantityString(C9401y.C9414m.ua_mc_description_marked_read, size, new Object[]{Integer.valueOf(size)}));
            actionMode.finish();
        } else if (menuItem.getItemId() == C9401y.C9409h.delete) {
            C9372h.m35254H().mo18999B().mo18922e(mo18906a());
            int size2 = mo18906a().size();
            Q0.announceForAccessibility(resources.getQuantityString(C9401y.C9414m.ua_mc_description_deleted, size2, new Object[]{Integer.valueOf(size2)}));
            actionMode.finish();
        } else if (menuItem.getItemId() == C9401y.C9409h.select_all) {
            for (int i = 0; i < Q0.getCount(); i++) {
                Q0.setItemChecked(i, true);
            }
        }
        return true;
    }

    public boolean onCreateActionMode(@C0359n0 ActionMode actionMode, @C0359n0 Menu menu) {
        C9371g T0;
        boolean z = false;
        if (this.f25549a.mo19064Q0() == null) {
            return false;
        }
        actionMode.getMenuInflater().inflate(C9401y.C9413l.ua_mc_action_mode, menu);
        int checkedItemCount = this.f25549a.mo19064Q0().getCheckedItemCount();
        actionMode.setTitle(this.f25549a.getResources().getQuantityString(C9401y.C9414m.ua_selected_count, checkedItemCount, new Object[]{Integer.valueOf(checkedItemCount)}));
        SparseBooleanArray checkedItemPositions = this.f25549a.mo19064Q0().getCheckedItemPositions();
        int i = 0;
        while (true) {
            if (i < checkedItemPositions.size()) {
                if (checkedItemPositions.valueAt(i) && (T0 = this.f25549a.mo19067T0(checkedItemPositions.keyAt(i))) != null && !T0.mo18991o0()) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        menu.findItem(C9401y.C9409h.mark_read).setVisible(z);
        return true;
    }

    public void onDestroyActionMode(@C0359n0 ActionMode actionMode) {
    }

    public void onItemCheckedStateChanged(@C0359n0 ActionMode actionMode, int i, long j, boolean z) {
        if (this.f25549a.mo19064Q0() != null) {
            int checkedItemCount = this.f25549a.mo19064Q0().getCheckedItemCount();
            actionMode.setTitle(this.f25549a.getResources().getQuantityString(C9401y.C9414m.ua_selected_count, checkedItemCount, new Object[]{Integer.valueOf(checkedItemCount)}));
            if (this.f25549a.mo19066S0() != null) {
                this.f25549a.mo19066S0().notifyDataSetChanged();
            }
            actionMode.invalidate();
        }
    }

    public boolean onPrepareActionMode(@C0359n0 ActionMode actionMode, @C0359n0 Menu menu) {
        C9371g T0;
        boolean z = false;
        if (this.f25549a.mo19064Q0() == null) {
            return false;
        }
        SparseBooleanArray checkedItemPositions = this.f25549a.mo19064Q0().getCheckedItemPositions();
        int i = 0;
        while (true) {
            if (i < checkedItemPositions.size()) {
                if (checkedItemPositions.valueAt(i) && (T0 = this.f25549a.mo19067T0(checkedItemPositions.keyAt(i))) != null && !T0.mo18991o0()) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        menu.findItem(C9401y.C9409h.mark_read).setVisible(z);
        return true;
    }
}
