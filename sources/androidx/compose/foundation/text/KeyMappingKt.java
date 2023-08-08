package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p004ui.input.key.C15434a;
import androidx.compose.p004ui.input.key.C15436b;
import androidx.compose.p004ui.input.key.C15439d;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class KeyMappingKt {
    @C12579k

    /* renamed from: a */
    public static final C2771g f7165a = new C2718b(m12313a(KeyMappingKt$defaultKeyMapping$1.f7168a));

    /* renamed from: androidx.compose.foundation.text.KeyMappingKt$a */
    public static final class C2717a implements C2771g {

        /* renamed from: a */
        public final /* synthetic */ C11300l<C15436b, Boolean> f7166a;

        public C2717a(C11300l<? super C15436b, Boolean> lVar) {
            this.f7166a = lVar;
        }

        @C12580l
        /* renamed from: a */
        public KeyCommand mo9313a(@C12579k KeyEvent keyEvent) {
            boolean z;
            Intrinsics.checkNotNullParameter(keyEvent, "event");
            if (!this.f7166a.invoke(C15436b.m68252a(keyEvent)).booleanValue() || !C15439d.m68279g(keyEvent)) {
                if (this.f7166a.invoke(C15436b.m68252a(keyEvent)).booleanValue()) {
                    long a = C15439d.m68273a(keyEvent);
                    C2781n nVar = C2781n.f7301a;
                    if (C15434a.m67412E4(a, nVar.mo9545d())) {
                        z = true;
                    } else {
                        z = C15434a.m67412E4(a, nVar.mo9555n());
                    }
                    if (z) {
                        return KeyCommand.COPY;
                    }
                    if (C15434a.m67412E4(a, nVar.mo9562u())) {
                        return KeyCommand.PASTE;
                    }
                    if (C15434a.m67412E4(a, nVar.mo9563v())) {
                        return KeyCommand.CUT;
                    }
                    if (C15434a.m67412E4(a, nVar.mo9542a())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (C15434a.m67412E4(a, nVar.mo9564w())) {
                        return KeyCommand.REDO;
                    }
                    if (C15434a.m67412E4(a, nVar.mo9565x())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                } else if (C15439d.m68277e(keyEvent)) {
                    return null;
                } else {
                    if (C15439d.m68279g(keyEvent)) {
                        long a2 = C15439d.m68273a(keyEvent);
                        C2781n nVar2 = C2781n.f7301a;
                        if (C15434a.m67412E4(a2, nVar2.mo9550i())) {
                            return KeyCommand.SELECT_LEFT_CHAR;
                        }
                        if (C15434a.m67412E4(a2, nVar2.mo9551j())) {
                            return KeyCommand.SELECT_RIGHT_CHAR;
                        }
                        if (C15434a.m67412E4(a2, nVar2.mo9552k())) {
                            return KeyCommand.SELECT_UP;
                        }
                        if (C15434a.m67412E4(a2, nVar2.mo9549h())) {
                            return KeyCommand.SELECT_DOWN;
                        }
                        if (C15434a.m67412E4(a2, nVar2.mo9559r())) {
                            return KeyCommand.SELECT_PAGE_UP;
                        }
                        if (C15434a.m67412E4(a2, nVar2.mo9558q())) {
                            return KeyCommand.SELECT_PAGE_DOWN;
                        }
                        if (C15434a.m67412E4(a2, nVar2.mo9557p())) {
                            return KeyCommand.SELECT_LINE_START;
                        }
                        if (C15434a.m67412E4(a2, nVar2.mo9556o())) {
                            return KeyCommand.SELECT_LINE_END;
                        }
                        if (C15434a.m67412E4(a2, nVar2.mo9555n())) {
                            return KeyCommand.PASTE;
                        }
                        return null;
                    }
                    long a3 = C15439d.m68273a(keyEvent);
                    C2781n nVar3 = C2781n.f7301a;
                    if (C15434a.m67412E4(a3, nVar3.mo9550i())) {
                        return KeyCommand.LEFT_CHAR;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9551j())) {
                        return KeyCommand.RIGHT_CHAR;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9552k())) {
                        return KeyCommand.UP;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9549h())) {
                        return KeyCommand.DOWN;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9559r())) {
                        return KeyCommand.PAGE_UP;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9558q())) {
                        return KeyCommand.PAGE_DOWN;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9557p())) {
                        return KeyCommand.LINE_START;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9556o())) {
                        return KeyCommand.LINE_END;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9553l())) {
                        return KeyCommand.NEW_LINE;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9544c())) {
                        return KeyCommand.DELETE_PREV_CHAR;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9548g())) {
                        return KeyCommand.DELETE_NEXT_CHAR;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9560s())) {
                        return KeyCommand.PASTE;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9547f())) {
                        return KeyCommand.CUT;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9546e())) {
                        return KeyCommand.COPY;
                    }
                    if (C15434a.m67412E4(a3, nVar3.mo9561t())) {
                        return KeyCommand.TAB;
                    }
                    return null;
                }
            } else if (C15434a.m67412E4(C15439d.m68273a(keyEvent), C2781n.f7301a.mo9565x())) {
                return KeyCommand.REDO;
            } else {
                return null;
            }
        }
    }

    /* renamed from: androidx.compose.foundation.text.KeyMappingKt$b */
    public static final class C2718b implements C2771g {

        /* renamed from: a */
        public final /* synthetic */ C2771g f7167a;

        public C2718b(C2771g gVar) {
            this.f7167a = gVar;
        }

        @C12580l
        /* renamed from: a */
        public KeyCommand mo9313a(@C12579k KeyEvent keyEvent) {
            Intrinsics.checkNotNullParameter(keyEvent, "event");
            KeyCommand keyCommand = null;
            if (C15439d.m68279g(keyEvent) && C15439d.m68277e(keyEvent)) {
                long a = C15439d.m68273a(keyEvent);
                C2781n nVar = C2781n.f7301a;
                if (C15434a.m67412E4(a, nVar.mo9550i())) {
                    keyCommand = KeyCommand.SELECT_LEFT_WORD;
                } else if (C15434a.m67412E4(a, nVar.mo9551j())) {
                    keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                } else if (C15434a.m67412E4(a, nVar.mo9552k())) {
                    keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                } else if (C15434a.m67412E4(a, nVar.mo9549h())) {
                    keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                }
            } else if (C15439d.m68277e(keyEvent)) {
                long a2 = C15439d.m68273a(keyEvent);
                C2781n nVar2 = C2781n.f7301a;
                if (C15434a.m67412E4(a2, nVar2.mo9550i())) {
                    keyCommand = KeyCommand.LEFT_WORD;
                } else if (C15434a.m67412E4(a2, nVar2.mo9551j())) {
                    keyCommand = KeyCommand.RIGHT_WORD;
                } else if (C15434a.m67412E4(a2, nVar2.mo9552k())) {
                    keyCommand = KeyCommand.PREV_PARAGRAPH;
                } else if (C15434a.m67412E4(a2, nVar2.mo9549h())) {
                    keyCommand = KeyCommand.NEXT_PARAGRAPH;
                } else if (C15434a.m67412E4(a2, nVar2.mo9554m())) {
                    keyCommand = KeyCommand.DELETE_PREV_CHAR;
                } else if (C15434a.m67412E4(a2, nVar2.mo9548g())) {
                    keyCommand = KeyCommand.DELETE_NEXT_WORD;
                } else if (C15434a.m67412E4(a2, nVar2.mo9544c())) {
                    keyCommand = KeyCommand.DELETE_PREV_WORD;
                } else if (C15434a.m67412E4(a2, nVar2.mo9543b())) {
                    keyCommand = KeyCommand.DESELECT;
                }
            } else if (C15439d.m68279g(keyEvent)) {
                long a3 = C15439d.m68273a(keyEvent);
                C2781n nVar3 = C2781n.f7301a;
                if (C15434a.m67412E4(a3, nVar3.mo9557p())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (C15434a.m67412E4(a3, nVar3.mo9556o())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (C15439d.m68276d(keyEvent)) {
                long a4 = C15439d.m68273a(keyEvent);
                C2781n nVar4 = C2781n.f7301a;
                if (C15434a.m67412E4(a4, nVar4.mo9544c())) {
                    keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                } else if (C15434a.m67412E4(a4, nVar4.mo9548g())) {
                    keyCommand = KeyCommand.DELETE_TO_LINE_END;
                }
            }
            if (keyCommand == null) {
                return this.f7167a.mo9313a(keyEvent);
            }
            return keyCommand;
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C2771g m12313a(@C12579k C11300l<? super C15436b, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "shortcutModifier");
        return new C2717a(lVar);
    }

    @C12579k
    /* renamed from: b */
    public static final C2771g m12314b() {
        return f7165a;
    }
}
