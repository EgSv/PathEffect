package ru.startandroid.develop.patheffect

import android.content.Context
import android.graphics.*
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(DrawView(this))
    }

    /*internal inner class DrawView(context: Context): View(context) {
        private var path: Path = Path()
        private var p1: Paint
        private var p2: Paint
        private var p3: Paint

        init {
            path.rLineTo(100f, 300f)
            path.rLineTo(100f, -100f)
            path.rLineTo(100f, 300f)

            p1 = Paint(Paint.ANTI_ALIAS_FLAG)
            p1.style = Paint.Style.STROKE
            p1.strokeWidth = 3f

            p2 = Paint(p1)
            p2.color = Color.GREEN
            p2.pathEffect = CornerPathEffect(25f)

            p3 = Paint(p1)
            p3.color = Color.BLUE
            p3.pathEffect = CornerPathEffect(50f)
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            canvas.translate(100f, 100f)
            canvas.drawPath(path, p1)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p2)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p3)
        }
         */

    /*internal class DrawView(context: Context?) : View(context) {
        private var path: Path = Path()
        private var p1: Paint
        private var p2: Paint
        private var p3: Paint

        init {
            path.rLineTo(100f, 300f)
            path.rLineTo(100f, -100f)
            path.rLineTo(100f, 300f)

            p1 = Paint(Paint.ANTI_ALIAS_FLAG)
            p1.style = Paint.Style.STROKE
            p1.strokeWidth = 3f

            p2 = Paint(p1)
            p2.color = Color.GREEN
            p2.pathEffect = DiscretePathEffect(10f, 5f)

            p3 = Paint(p1)
            p3.color = Color.BLUE
            p3.pathEffect = DiscretePathEffect(10f, 15f)
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            canvas.translate(100f, 100f)
            canvas.drawPath(path, p1)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p2)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p3)
        }
    }

     */

    /*internal class DrawView(context: Context?) : View(context) {
        private var path: Path = Path()
        private var p1: Paint
        private var p2: Paint
        private var p3: Paint

        init {
            path.rLineTo(100f, 300f)
            path.rLineTo(100f, -100f)
            path.rLineTo(100f, 300f)

            p1 = Paint(Paint.ANTI_ALIAS_FLAG)
            p1.style = Paint.Style.STROKE
            p1.strokeWidth = 7f

            p2 = Paint(p1)
            p2.color = Color.GREEN
            p2.pathEffect = DashPathEffect(floatArrayOf(30f, 10f), 0f)

            p3 = Paint(p1)
            p3.color = Color.BLUE
            p3.pathEffect = DashPathEffect(floatArrayOf(50f, 10f, 5f, 10f), 25f)
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            canvas.translate(100f, 100f)
            canvas.drawPath(path, p1)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p2)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p3)
        }
    } */

    /*internal class DrawView(context: Context?) : View(context) {
        private var path: Path = Path()
        private var pathStamp: Path
        private var p1: Paint
        private var p2: Paint
        private var p3: Paint
        private var p4: Paint

        init {
            path.addRect(-100f, 0f, 100f, 500f, Path.Direction.CW)
            pathStamp = Path()
            pathStamp.lineTo(-10f, -10f)
            pathStamp.lineTo(10f, 0f)
            pathStamp.lineTo(-10f, 10f)
            pathStamp.close()

            p1 = Paint(Paint.ANTI_ALIAS_FLAG)
            p1.style = Paint.Style.STROKE
            p1.strokeWidth = 20f

            p2 = Paint(p1)
            p2.color = Color.GREEN
            p2.pathEffect = PathDashPathEffect(pathStamp, 20f, 0f, PathDashPathEffect.Style.MORPH)

            p3 = Paint(p1)
            p3.color = Color.BLUE
            p3.pathEffect = PathDashPathEffect(pathStamp, 20f, 0f, PathDashPathEffect.Style.ROTATE)

            p4 = Paint(p1)
            p4.color = Color.RED
            p4.pathEffect =
                PathDashPathEffect(pathStamp, 20f, 10f, PathDashPathEffect.Style.TRANSLATE)
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            canvas.translate(120f, 100f)
            canvas.drawPath(path, p1)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p2)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p3)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p4)
        }
    }*/

    /*internal class DrawView(context: Context?) : View(context) {
        private var path: Path = Path()
        private var p1: Paint
        private var p2: Paint
        private var p3: Paint
        private var p4: Paint
        private var p5: Paint

        init {
            path.addRect(-100f, 0f, 100f, 500f, Path.Direction.CW)
            val pe1: PathEffect = CornerPathEffect(100f)
            val pe2: PathEffect = DashPathEffect(floatArrayOf(20f, 5f), 0f)
            val pe3: PathEffect = ComposePathEffect(pe2, pe1)
            val pe4: PathEffect = SumPathEffect(pe1, pe2)
            p1 = Paint(Paint.ANTI_ALIAS_FLAG)
            p1.style = Paint.Style.STROKE
            p1.strokeWidth = 3f
            p2 = Paint(p1)
            p2.color = Color.GREEN
            p2.pathEffect = pe1
            p3 = Paint(p1)
            p3.color = Color.BLUE
            p3.pathEffect = pe2
            p4 = Paint(p1)
            p4.color = Color.RED
            p4.pathEffect = pe3
            p5 = Paint(p1)
            p5.color = Color.YELLOW
            p5.pathEffect = pe4
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            canvas.translate(120f, 100f)
            canvas.drawPath(path, p1)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p2)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p3)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p4)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p5)
        }
    }*/

    internal class DrawView(context: Context?) : View(context) {
        private var path: Path = Path()
        private var p1: Paint
        private var p2: Paint
        private var p3: Paint
        private var p4: Paint
        private var p5: Paint

        init {
            path.addRect(-100f, 0f, 100f, 500f, Path.Direction.CW)
            val pe1: PathEffect = CornerPathEffect(100f)
            val pe2: PathEffect = DiscretePathEffect(15f, 10f)
            val pe3: PathEffect = ComposePathEffect(pe1, pe2)
            val pe4: PathEffect = ComposePathEffect(pe2, pe1)
            p1 = Paint(Paint.ANTI_ALIAS_FLAG)
            p1.style = Paint.Style.STROKE
            p1.strokeWidth = 7f
            p2 = Paint(p1)
            p2.color = Color.GREEN
            p2.pathEffect = pe1
            p3 = Paint(p1)
            p3.color = Color.BLUE
            p3.pathEffect = pe2
            p4 = Paint(p1)
            p4.color = Color.RED
            p4.pathEffect = pe3
            p5 = Paint(p1)
            p5.color = Color.YELLOW
            p5.pathEffect = pe4
        }

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            canvas.translate(120f, 100f)
            canvas.drawPath(path, p1)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p2)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p3)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p4)

            canvas.translate(250f, 0f)
            canvas.drawPath(path, p5)
        }
    }
}