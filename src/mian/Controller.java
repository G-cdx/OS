package mian;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author longting
 */
public class Controller {
    /**
    双击打开文件管理新窗口
     */
    public void file_clicked(MouseEvent mouseEvent) throws IOException {
        if(mouseEvent.getClickCount() >= 2 && mouseEvent.getButton() == MouseButton.PRIMARY) {
            Stage fileStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("../file/file.fxml"));
            fileStage.setTitle("文件管理");
            fileStage.setScene(new Scene(root));
            fileStage.show();
        }
    }

    /**
     双击打开设备、进程、设备管理新窗口
     */
    public void equipment_clicked(MouseEvent mouseEvent) throws IOException {
        if(mouseEvent.getClickCount() >= 2 && mouseEvent.getButton() == MouseButton.PRIMARY) {
            Stage fileStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("../equipment_process_storage/EPS.fxml"));
            fileStage.setTitle("设备、进程、设备管理");
            fileStage.setScene(new Scene(root));
            fileStage.show();
        }
    }
}