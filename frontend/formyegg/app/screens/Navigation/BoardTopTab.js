import * as React from 'react';
import {createMaterialTopTabNavigator} from '@react-navigation/material-top-tabs';
import BoardType1Screen from '../Board/BoardType1Screen';
import BoardType2Screen from '../Board/BoardType2Screen';
import BoardType3Screen from '../Board/BoardType3Screen';
import {Button} from 'react-native';

const Tab = createMaterialTopTabNavigator();

const BoardTopTab = ({navigation}) => {
  // function BoardTopTab(navigation) {
  return (
    <>
      {/* <Button title="글작성" onPress={() => navigation.navigate('Write')} />
      <Button title="채팅" onPress={() => navigation.navigate('Chat')} /> */}
      <Tab.Navigator>
        <Tab.Screen
          name="type1"
          component={BoardType1Screen}
          options={{tabBarLabel: '임신'}}
        />
        <Tab.Screen
          name="type2"
          component={BoardType2Screen}
          options={{tabBarLabel: '출산'}}
        />
        <Tab.Screen
          name="type3"
          component={BoardType3Screen}
          options={{tabBarLabel: '육아'}}
        />
      </Tab.Navigator>
    </>
  );
};

export default BoardTopTab;
