class TV{
static boolean isOn;
static boolean onOrOff(){
if(isOn==false){
isOn=true;
System.out.println("The Speaker is On ");}
else if(isOn==true){
isOn=false;
System.out.println("The Speaker if off ");
}

return isOn;
}

}
