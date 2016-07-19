# ImageProgressBar
可以用图片来标记progressbar进度的特殊progressbar

## Preview ##
![效果图](http://v2.freep.cn/3tb_1607191514016deg512293.gif)

## Usage ##

- 在xml中像官方Progressbar一样使用，并设置自己喜欢的风格
  
       <com.clj.imageprogressbar.ImageProgressBar
        android:id="@+id/progressbar1"
        android:layout_width="match_parent"
        android:layout_height="30dp"
        android:layout_gravity="center_horizontal"
        android:background="@android:color/holo_blue_dark"
        android:paddingLeft="2dp"
        android:paddingRight="2dp"
        custom:progress_current="0"
        custom:progress_image_id="@mipmap/ic_car"
        custom:progress_image_offset="5dp"
        custom:progress_image_proportion="1.1"
        custom:progress_max="100"
        custom:progress_reached_bar_height="2dp"
        custom:progress_reached_color="@color/colorAccent"
        custom:progress_unreached_bar_height="2dp"
        custom:progress_unreached_color="@color/colorPrimary" />
     

- xml属性说明

        <!--当前进度-->
        <attr name="progress_current" format="integer" />
        <!--最大进度-->
        <attr name="progress_max" format="integer" />
        <!--未达到进度条的颜色-->
        <attr name="progress_unreached_color" format="color" />
        <!--已达到进度条的颜色-->
        <attr name="progress_reached_color" format="color" />
        <!--已达到进度条的高度-->
        <attr name="progress_reached_bar_height" format="dimension" />
        <!--未达到进度条的高度-->
        <attr name="progress_unreached_bar_height" format="dimension" />
        <!--图片和进度条之间的距离-->
        <attr name="progress_image_offset" format="dimension" />
        <!--图片资源id-->
        <attr name="progress_image_id" format="reference" />
        <!--图片的长宽比-->
        <attr name="progress_image_proportion" format="float" />