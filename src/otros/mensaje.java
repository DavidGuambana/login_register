package otros;


import rojerusan.RSNotifyAnimated;


public class mensaje {
     public static void success(String actividad, String mensaje) {
        new rojerusan.RSNotifyAnimated(actividad, mensaje, 5, RSNotifyAnimated.PositionNotify.TopRight, RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
    }

    public static void warning(String actividad, String mensaje) {
        new rojerusan.RSNotifyAnimated(actividad, mensaje,
                5, RSNotifyAnimated.PositionNotify.TopRight, RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.WARNING).setVisible(true);
    }

    public static void error(String actividad, String mensaje) {
        new rojerusan.RSNotifyAnimated(actividad, mensaje, 5, RSNotifyAnimated.PositionNotify.TopRight, RSNotifyAnimated.AnimationNotify.RightLeft,
                RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
    }
}
