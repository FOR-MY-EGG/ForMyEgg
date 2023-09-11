import { createAppContainer, createSwitchNavigator } from 'react-navigation';
import { createStackNavigator } from 'react-navigation-stack';
import LoginScreen from '../login/Login';
import HomeScreen from '../Home';
import BoardScreen from '../board/Board';

const AuthStack = createStackNavigator(
    {
        LoginScreen: {screen: LoginScreen},
        HomeScreen: {screen: HomeScreen},
        BoardScreen: {screen: BoardScreen}
    },
    {
        initialRouteName: 'BoardScreen'
    }
);

// 최상단 네비게이터
const AppNavigator = createSwitchNavigator(
    {
        Auth: AuthStack
    },
    {
        initialRouteName: 'Auth',
    }
);

export default createAppContainer(AppNavigator);