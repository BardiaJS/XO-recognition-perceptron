package com.example.demo;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HelloController {

    public static double [] weight;
    public static double bias;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    public Button btn16;
    public Button btn17;
    public Button btn18;
    public Button btn19;
    public Button btn20;
    public Button btn21;
    public Button btn22;
    public Button btn23;
    public Button btn24;
    public Button btn25;
    public Label result;
    public Button btnClear;
    public Button btnGo;
    public Button btnTraining;


    public void btn1Clicked(ActionEvent actionEvent) {
        if(btn1.getText().equals("*")){
            btn1.setText("");
        }else{
            btn1.setText("*");
        }
    }

    public void btn2Clicked(ActionEvent actionEvent) {
        if(btn2.getText().equals("*")){
            btn2.setText("");
        }else{
            btn2.setText("*");
        }
    }

    public void btn3Clicked(ActionEvent actionEvent) {
        if(btn3.getText().equals("*")){
            btn3.setText("");
        }else{
            btn3.setText("*");
        }
    }

    public void btn4Clicked(ActionEvent actionEvent) {
        if(btn4.getText().equals("*")){
            btn4.setText("");
        }else{
            btn4.setText("*");
        }
    }

    public void btn5Clicked(ActionEvent actionEvent) {
        if(btn5.getText().equals("*")){
            btn5.setText("");
        }else{
            btn5.setText("*");
        }
    }

    public void btn6Clicked(ActionEvent actionEvent) {
        if(btn6.getText().equals("*")){
            btn6.setText("");
        }else{
            btn6.setText("*");
        }
    }

    public void btn7Clicked(ActionEvent actionEvent) {
        if(btn7.getText().equals("*")){
            btn7.setText("");
        }else{
            btn7.setText("*");
        }
    }

    public void btn8Clicked(ActionEvent actionEvent) {
        if(btn8.getText().equals("*")){
            btn8.setText("");
        }else{
            btn8.setText("*");
        }
    }

    public void btn9Clicked(ActionEvent actionEvent) {
        if(btn9.getText().equals("*")){
            btn9.setText("");
        }else{
            btn9.setText("*");
        }
    }

    public void btn10Clicked(ActionEvent actionEvent) {
        if(btn10.getText().equals("*")){
            btn10.setText("");
        }else{
            btn10.setText("*");
        }
    }

    public void btn11Clicked(ActionEvent actionEvent) {
        if(btn11.getText().equals("*")){
            btn11.setText("");
        }else{
            btn11.setText("*");
        }
    }

    public void btn12Clicked(ActionEvent actionEvent) {
        if(btn12.getText().equals("*")){
            btn12.setText("");
        }else{
            btn12.setText("*");
        }
    }

    public void btn13Clicked(ActionEvent actionEvent) {
        if(btn13.getText().equals("*")){
            btn13.setText("");
        }else{
            btn13.setText("*");
        }
    }

    public void btn14Clicked(ActionEvent actionEvent) {
        if(btn14.getText().equals("*")){
            btn14.setText("");
        }else{
            btn14.setText("*");
        }
    }

    public void btn15Clicked(ActionEvent actionEvent) {
        if(btn15.getText().equals("*")){
            btn15.setText("");
        }else{
            btn15.setText("*");
        }
    }

    public void btn16Clicked(ActionEvent actionEvent) {
        if(btn16.getText().equals("*")){
            btn16.setText("");
        }else{
            btn16.setText("*");
        }
    }

    public void btn17Clicked(ActionEvent actionEvent) {
        if(btn17.getText().equals("*")){
            btn17.setText("");
        }else{
            btn17.setText("*");
        }
    }

    public void btn18Clicked(ActionEvent actionEvent) {
        if(btn18.getText().equals("*")){
            btn18.setText("");
        }else{
            btn18.setText("*");
        }
    }

    public void btn19Clicked(ActionEvent actionEvent) {
        if(btn19.getText().equals("*")){
            btn19.setText("");
        }else{
            btn19.setText("*");
        }
    }

    public void btn20Clicked(ActionEvent actionEvent) {
        if(btn20.getText().equals("*")){
            btn20.setText("");
        }else{
            btn20.setText("*");
        }
    }

    public void btn21Clicked(ActionEvent actionEvent) {
        if(btn21.getText().equals("*")){
            btn21.setText("");
        }else{
            btn21.setText("*");
        }
    }

    public void btn22Clicked(ActionEvent actionEvent) {
        if(btn22.getText().equals("*")){
            btn22.setText("");
        }else{
            btn22.setText("*");
        }
    }

    public void btn23Clicked(ActionEvent actionEvent) {
        if(btn23.getText().equals("*")){
            btn23.setText("");
        }else{
            btn23.setText("*");
        }
    }

    public void btn24Clicked(ActionEvent actionEvent) {
        if(btn24.getText().equals("*")){
            btn24.setText("");
        }else{
            btn24.setText("*");
        }
    }

    public void btn25Clicked(ActionEvent actionEvent) {
        if(btn25.getText().equals("*")){
            btn25.setText("");
        }else{
            btn25.setText("*");
        }
    }

    public void btnGoClicked(ActionEvent actionEvent) throws IOException {
        String final_result =  input_array_calculate();
        result.setText(final_result);

    }

    public void btnClearClicked(ActionEvent actionEvent) {
        btn1.setText(" ");
        btn2.setText(" ");
        btn3.setText(" ");
        btn4.setText(" ");
        btn5.setText(" ");
        btn6.setText(" ");
        btn7.setText(" ");
        btn8.setText(" ");
        btn9.setText(" ");
        btn10.setText(" ");
        btn11.setText(" ");
        btn12.setText(" ");
        btn13.setText(" ");
        btn14.setText(" ");
        btn15.setText(" ");
        btn16.setText(" ");
        btn17.setText(" ");
        btn18.setText(" ");
        btn19.setText(" ");
        btn21.setText(" ");
        btn22.setText(" ");
        btn23.setText(" ");
        btn24.setText(" ");
        btn25.setText(" ");
        result.setText(" ");
    }

    public void btnTrainingClicked(ActionEvent actionEvent) {
        training();
    }

    public String input_array_calculate() throws IOException {
        double [][] input_array = new double[5][5];
        if(btn1.getText().equals("*")){
            input_array[0][0] = 1;
        }else{
            input_array[0][0] = -1;
        }
        if(btn2.getText().equals("*")){
            input_array[1][0] = 1;
        }else{
            input_array[1][0] = -1;
        }
        if(btn3.getText().equals("*")){
            input_array[2][0] = 1;
        }else{
            input_array[2][0] = -1;
        }
        if(btn4.getText().equals("*")){
            input_array[3][0] = 1;
        }else{
            input_array[3][0] = -1;
        }
        if(btn5.getText().equals("*")){
            input_array[4][0] = 1;
        }else{
            input_array[4][0] = -1;
        }
        if(btn6.getText().equals("*")){
            input_array[0][1] = 1;
        }else{
            input_array[0][1] = -1;
        }
        if(btn7.getText().equals("*")){
            input_array[1][1] = 1;
        }else{
            input_array[1][1] = -1;
        }
        if(btn8.getText().equals("*")){
            input_array[2][1] = 1;
        }else{
            input_array[2][1] = -1;
        }
        if(btn9.getText().equals("*")){
            input_array[3][1] = 1;
        }else{
            input_array[3][1] = -1;
        }
        if(btn10.getText().equals("*")){
            input_array[4][1] = 1;
        }else{
            input_array[4][1] = -1;
        }
        if(btn11.getText().equals("*")){
            input_array[0][2] = 1;
        }else{
            input_array[0][2] = -1;
        }
        if(btn12.getText().equals("*")){
            input_array[1][2] = 1;
        }else{
            input_array[1][2] = -1;
        }
        if(btn13.getText().equals("*")){
            input_array[2][2] = 1;
        }else{
            input_array[2][2] = -1;
        }
        if(btn14.getText().equals("*")){
            input_array[3][2] = 1;
        }else{
            input_array[3][2] = -1;
        }
        if(btn15.getText().equals("*")){
            input_array[4][2] = 1;
        }else{
            input_array[4][2] = -1;
        }
        if(btn16.getText().equals("*")){
            input_array[0][3] = 1;
        }else{
            input_array[0][3] = -1;
        }
        if(btn17.getText().equals("*")){
            input_array[1][3] = 1;
        }else{
            input_array[1][3] = -1;
        }
        if(btn18.getText().equals("*")){
            input_array[2][3] = 1;
        }else{
            input_array[2][3] = -1;
        }
        if(btn19.getText().equals("*")){
            input_array[3][3] = 1;
        }else{
            input_array[3][3] = -1;
        }
        if(btn20.getText().equals("*")){
            input_array[4][3] = 1;
        }else{
            input_array[4][3] = -1;
        }
        if(btn21.getText().equals("*")){
            input_array[0][4] = 1;
        }else{
            input_array[0][4] = -1;
        }
        if(btn22.getText().equals("*")){
            input_array[1][4] = 1;
        }else{
            input_array[1][4] = -1;
        }
        if(btn23.getText().equals("*")){
            input_array[2][4] = 1;
        }else{
            input_array[2][4] = -1;
        }
        if(btn24.getText().equals("*")){
            input_array[3][4] = 1;
        }else{
            input_array[3][4] = -1;
        }
        if(btn25.getText().equals("*")){
            input_array[4][4] = 1;
        }else{
            input_array[4][4] = -1;
        }

        String isXO = "";
        double result = perceptron(input_array);
        if(result == 1) {
            isXO = "X";

            return isXO;
        }else if (result == -1){
            isXO ="O";

            return isXO;
        }else{
            isXO = "?";

            return  isXO;
        }


    }
    public static void training(){
        String fileName = "and-gate.txt"; // Replace with your file name
        List<double[]> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] numbers = line.split("\\s+"); // Split by whitespace
                double[] row = new double[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    row[i] = Double.parseDouble(numbers[i]);
                }
                data.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert the List to a 2D array if needed
        double[][] input_lists_and_targets = data.toArray(new double[data.size()][]);
        final double ALPHA =1;
        int epoch_length = input_lists_and_targets.length;
        weight = new double[input_lists_and_targets[0].length - 1];
        Arrays.fill(weight, 0);

        bias = 0;
        double total_epoch = 0;

        double [] data_for_current_epoch = new double[input_lists_and_targets[0].length];
        while (true){
            double number_of_epoch_errors = 0;
            for(int index_epoch= 0 ; index_epoch < epoch_length; index_epoch++){
                for(int column_index = 0; column_index < input_lists_and_targets[0].length; column_index++){
                    data_for_current_epoch[column_index] = input_lists_and_targets[index_epoch][column_index];
                }
                double net_input_for_current_epoch = 0;
                for (int index_value = 0 ; index_value <data_for_current_epoch.length - 1 ; index_value++){
                    net_input_for_current_epoch += (weight[index_value] * data_for_current_epoch[index_value]);
                }
                net_input_for_current_epoch += bias;
                double f = activation_function(net_input_for_current_epoch);
                if(f != data_for_current_epoch[data_for_current_epoch.length-1]){
                    number_of_epoch_errors += 1;
                    // updating the weights
                    for(int index_value = 0 ; index_value < data_for_current_epoch.length - 1; index_value++){
                        weight[index_value] += (data_for_current_epoch[index_value] * ALPHA * data_for_current_epoch[data_for_current_epoch.length -1 ]);
                    }
                    for (int i = 0 ; i < weight.length ; i++){
                        System.out.println();
                    }
                    bias += ALPHA * data_for_current_epoch[data_for_current_epoch.length - 1];
                }

            }
            total_epoch += 1;
            if(number_of_epoch_errors == 0 ){
                System.out.println("Training Finished");
                break;
            }
        }
        System.out.println("Weights are: ");
        for(int i = 0 ; i < weight.length; i++){
            System.out.println("w" + (i+1) + " is: " + weight[i]);
        }
        System.out.println("Bias is: " + bias);
        System.out.println("Total epoch is: " + total_epoch );



    }






    public static double perceptron(double[][] main_inputs ) throws IOException {
        double [] list_of_inputs = new double[main_inputs.length * main_inputs[0].length];
        int i = 0;
        for(int row = 0 ;row < main_inputs.length ; row++){
            for(int column = 0 ; column < main_inputs[0].length; column++){
                if(i < list_of_inputs.length){
                    list_of_inputs[i] = main_inputs[row][column];
                    i++;
                }
            }
        }

        double net_input = 0;
        for( i = 0 ; i < weight.length ; i++){
            net_input += weight[i] * list_of_inputs[i];
        }

        net_input += bias;
        return activation_function(net_input);
    }

    public static int activation_function(double net_input){
        final double THETA = 0.2;
        if(net_input > THETA){
            return 1;
        } else if (net_input < (-THETA)) {
            return -1;
        }else{
            return  0;
        }
    }





    public void btn1Entered(MouseEvent mouseEvent) {
        btn1.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn1Exited(MouseEvent mouseEvent) {
        btn1.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn2Entered(MouseEvent mouseEvent) {
        btn2.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn2Exited(MouseEvent mouseEvent) {
        btn2.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn3Entered(MouseEvent mouseEvent) {
        btn3.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn3Exited(MouseEvent mouseEvent) {
        btn3.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn4Entered(MouseEvent mouseEvent) {
        btn4.setStyle("--fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn5Entered(MouseEvent mouseEvent) {
        btn5.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn5Exited(MouseEvent mouseEvent){
        btn5.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");

    }

    public void btn4Exited(MouseEvent mouseEvent) {
        btn4.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn6Entered(MouseEvent mouseEvent) {
        btn6.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn6Exited(MouseEvent mouseEvent) {
        btn6.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn7Exited(MouseEvent mouseEvent) {
        btn7.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn7Entered(MouseEvent mouseEvent) {
        btn7.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn8Entered(MouseEvent mouseEvent) {
        btn8.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn8Exited(MouseEvent mouseEvent) {
        btn8.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn9Entered(MouseEvent mouseEvent) {
        btn9.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn9Exited(MouseEvent mouseEvent) {
        btn9.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn10Entered(MouseEvent mouseEvent) {
        btn10.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn10Exited(MouseEvent mouseEvent) {
        btn10.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn11Entered(MouseEvent mouseEvent) {
        btn11.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn11Exited(MouseEvent mouseEvent) {
        btn11.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn12Entered(MouseEvent mouseEvent) {
        btn12.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn12Exited(MouseEvent mouseEvent) {
        btn12.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn13Entered(MouseEvent mouseEvent) {
        btn13.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn13Exited(MouseEvent mouseEvent) {
        btn13.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn14Exited(MouseEvent mouseEvent) {
        btn14.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn14Entered(MouseEvent mouseEvent) {
        btn14.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn15Entered(MouseEvent mouseEvent) {
        btn15.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn15Exited(MouseEvent mouseEvent) {
        btn15.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn16Entered(MouseEvent mouseEvent) {
        btn16.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn16Exited(MouseEvent mouseEvent) {
        btn16.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn17Entered(MouseEvent mouseEvent) {
        btn17.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn17Exited(MouseEvent mouseEvent) {
        btn17.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn18Entered(MouseEvent mouseEvent) {
        btn18.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn18Exited(MouseEvent mouseEvent) {
        btn18.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn19Entered(MouseEvent mouseEvent) {
        btn19.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn19Exited(MouseEvent mouseEvent) {
        btn19.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn20Entered(MouseEvent mouseEvent) {
        btn20.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn20Exited(MouseEvent mouseEvent) {
        btn20.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn21Entered(MouseEvent mouseEvent) {
        btn21.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn21Exited(MouseEvent mouseEvent) {
        btn21.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn22Entered(MouseEvent mouseEvent) {
        btn22.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn22Exited(MouseEvent mouseEvent) {
        btn22.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn23Entered(MouseEvent mouseEvent) {
        btn23.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn23Exited(MouseEvent mouseEvent) {
        btn23.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn24Entered(MouseEvent mouseEvent) {
        btn24.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn24Exited(MouseEvent mouseEvent) {
        btn24.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn25Entered(MouseEvent mouseEvent) {
        btn25.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn25Exited(MouseEvent mouseEvent) {
        btn25.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btnClearEntered(MouseEvent mouseEvent) {
        btnClear.setStyle("-fx-background-color: #ffb7a1; -fx-pref-width: 100; -fx-pref-height:100; -fx-font-weight: bold;");
    }

    public void btnClearExited(MouseEvent mouseEvent) {
        btnClear.setStyle("-fx-background-color: #F87A53; -fx-pref-width: 100; -fx-pref-height:100; -fx-font-weight: bold;");
    }

    public void btnGoEntered(MouseEvent mouseEvent) {
        btnGo.setStyle("-fx-background-color: #daf7dc; -fx-pref-width: 100; -fx-pref-height:100; -fx-font-weight: bold;");
    }

    public void btnGoExited(MouseEvent mouseEvent) {
        btnGo.setStyle("-fx-background-color: #C2FFC7; -fx-pref-width: 100; -fx-pref-height:100; -fx-font-weight: bold;");
    }

    public void btnTrainingEntered(MouseEvent mouseEvent) {
        btnTraining.setStyle("-fx-background-color: #fffaed; -fx-pref-width: 100; -fx-pref-height:100; -fx-font-weight: bold;");
    }

    public void btnTrainingExited(MouseEvent mouseEvent) {
        btnTraining.setStyle("-fx-background-color: #F5E8C7; -fx-pref-width: 100; -fx-pref-height:100; -fx-font-weight: bold;" );
    }



}


