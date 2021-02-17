import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

public class MainGLEventsListener implements GLEventListener {
    NurbsManager nurbsManager;

    public MainGLEventsListener(NurbsManager nurbsManager) {
        this.nurbsManager = nurbsManager;
    }

    public void init(GLAutoDrawable glAutoDrawable) {

    }

    public void dispose(GLAutoDrawable glAutoDrawable) {

    }

    public void display(GLAutoDrawable drawable) {
        GL2 gl2 = drawable.getGL().getGL2();
        gl2.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);

        Point[] controlPoints = nurbsManager.getControlPoints();
        gl2.glColor3f(1, 0, 0);
        gl2.glPointSize(5);
        gl2.glBegin(GL2.GL_POINTS);
        for (Point point : controlPoints) {
            gl2.glVertex2d(point.getX(), point.getY());
        }
        gl2.glEnd();
    }

    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {

    }
}
