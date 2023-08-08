package com.contentsquare.android.sdk;

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
import com.contentsquare.android.C14146m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.contentsquare.android.sdk.db */
public class C14274db implements Window.Callback {

    /* renamed from: d */
    public static final C14277c f35235d = new C14277c();

    /* renamed from: e */
    public static final Window.Callback f35236e = new C14275a();

    /* renamed from: f */
    public static final Map<C14274db, Boolean> f35237f = new WeakHashMap();

    /* renamed from: g */
    public static List<WeakReference<C14552nd>> f35238g = new ArrayList();

    /* renamed from: a */
    public final Window.Callback f35239a;

    /* renamed from: b */
    public final C14277c f35240b;

    /* renamed from: c */
    public boolean f35241c = true;

    /* renamed from: com.contentsquare.android.sdk.db$a */
    public static class C14275a implements Window.Callback {
        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            return false;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return false;
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return false;
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            return false;
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            return false;
        }

        public void onActionModeFinished(ActionMode actionMode) {
        }

        public void onActionModeStarted(ActionMode actionMode) {
        }

        public void onAttachedToWindow() {
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            return false;
        }

        public View onCreatePanelView(int i) {
            return null;
        }

        public void onDetachedFromWindow() {
        }

        public boolean onMenuItemSelected(int i, MenuItem menuItem) {
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            return false;
        }

        public void onPanelClosed(int i, Menu menu) {
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            return false;
        }

        public boolean onSearchRequested() {
            return false;
        }

        public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        }

        public void onWindowFocusChanged(boolean z) {
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public boolean onSearchRequested(SearchEvent searchEvent) {
            return false;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return null;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.db$b */
    public static class C14276b {
        /* renamed from: a */
        public void mo34968a(Window window) {
            C14274db.m61378e(window);
        }

        /* renamed from: b */
        public void mo34969b(Window window, C14277c cVar) {
            C14274db.m61379f(window, cVar);
        }

        /* renamed from: c */
        public void mo34970c(List<WeakReference<C14552nd>> list) {
            C14274db.f35238g = list;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.db$c */
    public static class C14277c {
        /* renamed from: a */
        public Map<C14274db, Boolean> mo34971a() {
            return C14274db.f35237f;
        }

        /* renamed from: b */
        public void mo34972b(MotionEvent motionEvent) {
            C14146m.m60761n(motionEvent);
        }

        /* renamed from: c */
        public void mo34973c(MotionEvent motionEvent) {
            for (WeakReference<C14552nd> weakReference : C14274db.f35238g) {
                ((C14552nd) weakReference.get()).mo35958b(motionEvent);
            }
        }
    }

    public C14274db(Window.Callback callback, C14277c cVar) {
        this.f35240b = cVar;
        this.f35239a = callback == null ? f35236e : callback;
    }

    /* renamed from: b */
    public static void m61375b(Window window, C14277c cVar) {
        C14274db dbVar = new C14274db(window.getCallback(), cVar);
        cVar.mo34971a().put(dbVar, Boolean.TRUE);
        window.setCallback(dbVar);
    }

    /* renamed from: c */
    public static void m61376c(C14277c cVar) {
        for (C14274db dbVar : cVar.mo34971a().keySet()) {
            dbVar.f35241c = false;
        }
    }

    /* renamed from: d */
    public static boolean m61377d(Window window) {
        return !(window.getCallback() instanceof C14274db);
    }

    /* renamed from: e */
    public static void m61378e(Window window) {
        if (window.getCallback() instanceof C14274db) {
            window.setCallback(((C14274db) window.getCallback()).mo34919a());
        }
    }

    /* renamed from: f */
    public static void m61379f(Window window, C14277c cVar) {
        if (m61377d(window)) {
            m61376c(cVar);
            m61375b(window, cVar);
        }
    }

    /* renamed from: a */
    public Window.Callback mo34919a() {
        return this.f35239a;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f35239a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f35239a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f35239a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f35239a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f35241c) {
            this.f35240b.mo34972b(motionEvent);
            this.f35240b.mo34973c(motionEvent);
        }
        return this.f35239a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f35239a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f35239a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f35239a.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f35239a.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f35239a.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f35239a.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f35239a.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f35239a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f35239a.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f35239a.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f35239a.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f35239a.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f35239a.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f35239a.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested() {
        return this.f35239a.onSearchRequested();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f35239a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f35239a.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f35239a.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f35239a.onSearchRequested(searchEvent);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f35239a.onWindowStartingActionMode(callback, i);
    }
}
