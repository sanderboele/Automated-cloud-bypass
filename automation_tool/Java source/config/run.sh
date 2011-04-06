#!/bin/bash

while getopts 'hnmql:s:c:f:' OPTION
do
  case $OPTION in
  
  f)    fflag=1
		fval="$OPTARG"
		;;

  m) 	mflag=1
		;;

  n)	nflag=1
		;; 

  q)	qflag=1
		;;
  l)	lflag=1
		lval="$OPTARG"
		;;
  s)	sflag=1
		sval="$OPTARG"
		;;
  c)	cflag=1
		cval="$OPTARG"
  		;;
  h) 	hflag=1
		;;

  ?) printf "Usage: %s:[ -n ] [ -m ] [-q ] [-l value] [-s value] [-c value] [ -f value] \n" $(basename $0) >&2
	exit 2 ;;
  esac
done
shift $(($OPTIND -1))

if [ "$nflag" ]
then
	if [ "$fflag" ]
	then 
		java -jar DRACP1.jar -f $fval -n	
	else
		jva -jar  DRACP1.jar -n
	fi
fi

if [ "$mflag" ]
then
	if [ "$fflag" ]
	then 
		java -jar DRACP1.jar -f $fval -m	
	else
		jva -jar  DRACP1.jar -m
	fi
fi



if [ "$qflag" ]
then
	if [ "$fflag" ]
	then
		java -jar DRACP1.jar -f $fval -q
	else
		java -jar DRACP1.jar -q
	fi
fi

if [ "$lflag" ]
then
	if ["$fflag"]
	then
		java -jar DRACP1.jar -f $fval -l $lval
	else
		java -jar DRACP1.jar -l $lval 
	fi
fi

if [ "$sflag" ]
then
	if [ "$fflag" ]
	then 
		java -jar DRACP1.jar -f $fval -s $sval
	else
		java -jar DRACP1.jar -s $sval
	fi
fi

if [ "$cflag" ]
then
	if [ "$fval" ]
	then
		java -jar DRACP1.jar -f $fval -c $cval
	else
		java -jar DRACP1.jar -c $cval
	fi
fi

if [ "$hflag" ]
then
	java -jar DRACP1.jar -h
fi


