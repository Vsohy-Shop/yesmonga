package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.i */
public class C0548i implements Window.Callback {

    /* renamed from: a */
    public final Window.Callback f1477a;

    @C0376v0(23)
    /* renamed from: androidx.appcompat.view.i$a */
    public static class C0549a {
        @C0373u
        /* renamed from: a */
        public static boolean m2567a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        @C0373u
        /* renamed from: b */
        public static ActionMode m2568b(Window.Callback callback, ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.appcompat.view.i$b */
    public static class C0550b {
        @C0373u
        /* renamed from: a */
        public static void m2569a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
            callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.appcompat.view.i$c */
    public static class C0551c {
        @C0373u
        /* renamed from: a */
        public static void m2570a(Window.Callback callback, boolean z) {
            callback.onPointerCaptureChanged(z);
        }
    }

    public C0548i(Window.Callback callback) {
        if (callback != null) {
            this.f1477a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: a */
    public final Window.Callback mo1815a() {
        return this.f1477a;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1477a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1477a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f1477a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1477a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1477a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1477a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f1477a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f1477a.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f1477a.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f1477a.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f1477a.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f1477a.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f1477a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f1477a.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f1477a.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f1477a.onPanelClosed(i, menu);
    }

    @C0376v0(26)
    public void onPointerCaptureChanged(boolean z) {
        C0551c.m2570a(this.f1477a, z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f1477a.onPreparePanel(i, view, menu);
    }

    @C0376v0(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        C0550b.m2569a(this.f1477a, list, menu, i);
    }

    @C0376v0(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return C0549a.m2567a(this.f1477a, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1477a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f1477a.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f1477a.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.f1477a.onSearchRequested();
    }

    @C0376v0(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C0549a.m2568b(this.f1477a, callback, i);
    }
}
