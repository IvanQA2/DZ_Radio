package ru.netology;

public class Radio {
    private int radioStationNumber;
    private int radioSoundVolume;
    public void next() {
        if (radioStationNumber == 9) {
            radioStationNumber = 0;
        }else{
            radioStationNumber++;
        }
    }
    public void prev(){
        if (radioStationNumber == 0) {
            radioStationNumber = 9;
        }else{
            radioStationNumber--;
        }
    }

    public void nextVolume() {
        if (radioSoundVolume == 10) {
            return;
        }else{
            radioSoundVolume++;
        }
    }
    public void prevVolume(){
        if (radioSoundVolume == 0) {
            return;
        }else{
            radioSoundVolume--;
        }
    }

    public int getRadioStationNumber(){

        return radioStationNumber;
    }
    public void setRadioStationNumber(int radioStationNumber){
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > 9) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public int getRadioSoundVolume(){

        return radioSoundVolume;
    }

    public void setRadioSoundVolume(int radioSoundVolume){
        if (radioSoundVolume <0) {
            return;
        }
        if (radioSoundVolume >10) {
            return;
        }
        this.radioSoundVolume = radioSoundVolume;
    }

}
